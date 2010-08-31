package com.jme3.system.lwjgl;

import com.jme3.system.JmeContext.Type;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import com.jme3.system.AppSettings;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.PixelFormat;

public class LwjglDisplay extends LwjglAbstractDisplay {

    private static final Logger logger = Logger.getLogger(LwjglDisplay.class.getName());

    private final AtomicBoolean needRestart = new AtomicBoolean(false);

    protected DisplayMode getFullscreenDisplayMode(int width, int height, int bpp, int freq){
        try {
            DisplayMode[] modes = Display.getAvailableDisplayModes();
            for (DisplayMode mode : modes){
                if (mode.getWidth() == width
                 && mode.getHeight() == height
                 && (mode.getBitsPerPixel() == bpp || (bpp==24&&mode.getBitsPerPixel()==32))
                 && mode.getFrequency() == freq){
                    return mode;
                }
            }
        } catch (LWJGLException ex) {
            logger.log(Level.SEVERE, "Failed to acquire fullscreen display mode!", ex);
        }
        return null;
    }

    protected void createContext(AppSettings settings) throws LWJGLException{
        DisplayMode displayMode = null;
        if (settings.getWidth() <= 0 || settings.getHeight() <= 0){
            displayMode = Display.getDesktopDisplayMode();
            settings.setResolution(displayMode.getWidth(), displayMode.getHeight());
        }else if (settings.isFullscreen()){
            displayMode = getFullscreenDisplayMode(settings.getWidth(), settings.getHeight(),
                                                   settings.getBitsPerPixel(), settings.getFrequency());
            if (displayMode == null)
                throw new RuntimeException("Unable to find fullscreen display mode matching settings");
        }else{
            displayMode = new DisplayMode(settings.getWidth(), settings.getHeight());
        }

        frameRate = settings.getFrameRate();
        logger.log(Level.INFO, "Selected display mode: {0}", displayMode);
        
        Display.setTitle(settings.getTitle());
        if (displayMode != null)
            Display.setDisplayMode(displayMode);

        Display.setFullscreen(settings.isFullscreen());
        Display.setVSyncEnabled(settings.isVSync());

        if (!created.get()){
            PixelFormat pf = new PixelFormat(settings.getBitsPerPixel(),
                                             0,
                                             settings.getDepthBits(),
                                             settings.getStencilBits(),
                                             settings.getSamples());

            if (settings.getBoolean("GraphicsDebug")){
                ContextAttribs attr = new ContextAttribs();
                attr = attr.withDebug(true);
                Display.create(pf, attr);
            }else{
                Display.create(pf);
            }
        }
    }

    public void create(boolean waitFor){
        if (created.get()){
            logger.warning("create() called when display is already created!");
            return;
        }

        new Thread(this, "LWJGL Renderer Thread").start();
        if (waitFor)
            waitFor(true);
    }

    @Override
    public void runLoop(){
        if (needRestart.getAndSet(false)){
            try{
                createContext(settings);
            }catch (LWJGLException ex){
                logger.log(Level.SEVERE, "Failed to set display settings!", ex);
            }
            listener.reshape(settings.getWidth(), settings.getHeight());
            logger.info("Display restarted.");
        }

        super.runLoop();
    }

    @Override
    public void restart() {
        if (created.get()){
            needRestart.set(true);
        }else{
            logger.warning("Display is not created, cannot restart window.");
        }
    }

    public Type getType() {
        return Type.Display;
    }

    public void setTitle(String title){
        if (created.get())
            Display.setTitle(title);
    }

}
