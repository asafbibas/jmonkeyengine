/*
 * Copyright (c) 2003, jMonkeyEngine - Mojo Monkey Coding
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this 
 * list of conditions and the following disclaimer. 
 * 
 * Redistributions in binary form must reproduce the above copyright notice, 
 * this list of conditions and the following disclaimer in the documentation 
 * and/or other materials provided with the distribution. 
 * 
 * Neither the name of the Mojo Monkey Coding, jME, jMonkey Engine, nor the 
 * names of its contributors may be used to endorse or promote products derived 
 * from this software without specific prior written permission. 
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 * POSSIBILITY OF SUCH DAMAGE.
 *
 */
package jme.geometry.primitive;

import java.util.logging.Level;

import jme.exception.MonkeyRuntimeException;
import jme.math.Vector;
import jme.texture.TextureManager;
import jme.utility.LoggingSystem;

import org.lwjgl.opengl.GL;

/**
 * <code>Box</code> defines a primitive object of a box shape. The box is 
 * made up of six sides, with eight vertices. The vertices of the box is
 * defined by an array of <code>Vertex3f</code>. The order of this array is
 * important due to the fact that the point is defined by it's index. 
 * 
 * The indices to point match is as follows:<br>
 * 0 - Front face, top left<br>
 * 1 - Front face, top right<br>
 * 2 - Front face, bottom left<br>
 * 3 - Front face, bottom right<br>
 * 4 - Back face, top left<br>
 * 5 - Back face, top right<br>
 * 6 - Back face, bottom left<br>
 * 7 - Back face, bottom right<br>
 * 
 * @author Mark Powell
 * @version $Id: Box.java,v 1.1.1.1 2003-10-29 10:58:07 Anakan Exp $
 */
public class Box extends Primitive {
    private GL gl;
    private Vector[] corners;
    
    /**
     * Constructor instantiates an empty <code>Box</code> with all points
     * of the box defined as (0,0,0).
     */
    public Box() {
    	corners = new Vector[8];
    	for(int i = 0; i < 8; i++) {
    		corners[i] = new Vector();
    	}
    	initialize();
    	LoggingSystem.getLoggingSystem().getLogger().log(Level.INFO, 
    		"Box created.");
    }
    
    /**
     * Constructor instantiates a new <code>Box</code> object with the
     * defined points defining the dimensions.
     * @param corners the points of the box.
     * @throws MonkeyRuntimeException if corners is null.
     */
    public Box(Vector[] corners) {
		if(null == corners) {
			throw new MonkeyRuntimeException("Corners cannot be null.");
		}
        this.corners = corners;
		initialize();
		LoggingSystem.getLoggingSystem().getLogger().log(Level.INFO, 
					"Box created.");
    }
    
    /**
     * Constructor instantiates a new <code>Box</code> object that is a 
     * perfect cube with the given size for a side. The center of the
     * cube is (0,0,0).
     * @param size the length of a side of the cube.
     */
    public Box(float size) {
    	corners = new Vector[8];
    	
    	corners[0] = new Vector(-size/2, size/2, -size/2);
		corners[1] = new Vector(size/2, size/2, -size/2);
		corners[2] = new Vector(-size/2, -size/2, -size/2);
		corners[3] = new Vector(size/2, -size/2, -size/2);
		corners[4] = new Vector(-size/2, size/2, size/2);
		corners[5] = new Vector(size/2, size/2, size/2);
		corners[6] = new Vector(-size/2, -size/2, size/2);
		corners[7] = new Vector(size/2, -size/2, size/2);
		initialize();
		LoggingSystem.getLoggingSystem().getLogger().log(Level.INFO, 
					"Box created.");
    }
    
   /**
    * <code>render</code> renders the box with normals facing outward. If
    * a texture is assigned, the texture will be rendered on each face of
    * the box.
    */
    public void render() {
        if(getTextureId() > 0) {
            TextureManager.getTextureManager().bind(getTextureId());
            GL.glEnable(GL.GL_TEXTURE_2D);
        }
        
        GL.glBegin(GL.GL_QUADS);
        
        //front
        GL.glColor4f(red, blue, green, alpha);
        GL.glTexCoord2f(1,1);
        GL.glVertex3f(corners[0].x, corners[0].y, corners[0].z);
        GL.glTexCoord2f(0,1);
        GL.glVertex3f(corners[1].x, corners[1].y, corners[1].z);
        GL.glTexCoord2f(0,0);
		GL.glVertex3f(corners[3].x, corners[3].y, corners[3].z);
		GL.glTexCoord2f(1,0);
		GL.glVertex3f(corners[2].x, corners[2].y, corners[2].z);
		
		//back
		GL.glTexCoord2f(1,1);
        GL.glVertex3f(corners[5].x, corners[5].y, corners[5].z);
		GL.glTexCoord2f(0,1);
		GL.glVertex3f(corners[4].x, corners[4].y, corners[4].z);
		GL.glTexCoord2f(0,0);
		GL.glVertex3f(corners[6].x, corners[6].y, corners[6].z);
		GL.glTexCoord2f(1,0);
		GL.glVertex3f(corners[7].x, corners[7].y, corners[7].z);
		
        //Top
		GL.glTexCoord2f(1,1);
		GL.glVertex3f(corners[4].x, corners[4].y, corners[4].z);
		GL.glTexCoord2f(0,1);
		GL.glVertex3f(corners[5].x, corners[5].y, corners[5].z);
		GL.glTexCoord2f(0,0);
		GL.glVertex3f(corners[1].x, corners[1].y, corners[1].z);
		GL.glTexCoord2f(1,0);
		GL.glVertex3f(corners[0].x, corners[0].y, corners[0].z);
		
		//Bottom
		GL.glTexCoord2f(1,1);
		GL.glVertex3f(corners[6].x, corners[6].y, corners[6].z);
		GL.glTexCoord2f(0,1);
		GL.glVertex3f(corners[2].x, corners[2].y, corners[2].z);
		GL.glTexCoord2f(0,0);
		GL.glVertex3f(corners[3].x, corners[3].y, corners[3].z);
		GL.glTexCoord2f(1,0);
		GL.glVertex3f(corners[7].x, corners[7].y, corners[7].z);
		
		//left
		GL.glTexCoord2f(1,1);
		GL.glVertex3f(corners[4].x, corners[4].y, corners[4].z);
		GL.glTexCoord2f(0,1);
		GL.glVertex3f(corners[0].x, corners[0].y, corners[0].z);
		GL.glTexCoord2f(0,0);
		GL.glVertex3f(corners[2].x, corners[2].y, corners[2].z);
		GL.glTexCoord2f(1,0);
		GL.glVertex3f(corners[6].x, corners[6].y, corners[6].z);
		
		//right
		GL.glTexCoord2f(1,1);
		GL.glVertex3f(corners[1].x, corners[1].y, corners[1].z);
		GL.glTexCoord2f(0,1);
		GL.glVertex3f(corners[5].x, corners[5].y, corners[5].z);
		GL.glTexCoord2f(0,0);
		GL.glVertex3f(corners[7].x, corners[7].y, corners[7].z);
		GL.glTexCoord2f(1,0);
		GL.glVertex3f(corners[3].x, corners[3].y, corners[3].z);
        
        GL.glEnd();
        
        if(getTextureId() > 0) {
        	GL.glDisable(GL.GL_TEXTURE_2D);
        }
 
    }

    /**
     * <code>initialize</code> initializes the box for use.
     */
    public void initialize() {
    	float size = 0.0f;
    	//find the furtherest point from the center.
    	float distance;
    	for(int i = 0; i < 8; i++) {
    		distance = (float)Math.sqrt(corners[i].x * corners[i].x +
    				corners[i].y * corners[i].y +
    				corners[i].z * corners[i].z);
    		if(distance > size) {
    			size = distance;
    		}
    	}
    	
    }

   	/**
   	 * <code>preRender</code> does not perform any action for <code>Box</code>.
   	 */
    public void preRender() {
		//nothing to do here.
    }
    
    /**
     * <code>setCorners</code> sets the points of the box. 
     * @param corners the points of the box.
     * @throws MonkeyRuntimeException if corners is null.
     */
    public void setCorners(Vector[] corners) {
    	if(null == corners) {
    		throw new MonkeyRuntimeException("Corners cannot be null.");
    	}
    	this.corners = corners;
		initialize();
    }
    
    /**
     * <code>setCorner</code> sets a single point of the box. Using 
     * the mapping of:
     * 0 - Front face, top left<br>
	 * 1 - Front face, top right<br>
	 * 2 - Front face, bottom left<br>
	 * 3 - Front face, bottom right<br>
	 * 4 - Back face, top left<br>
	 * 5 - Back face, top right<br>
	 * 6 - Back face, bottom left<br>
	 * 7 - Back face, bottom right<br>
     * 
     * @param corner the corner to change.
     * @param point the new point for the corner.
     */
    public void setCorner(int corner, Vector point) {
    	corners[corner] = point;
		initialize();
    }
    
    public Vector[] getPoints() {
        return corners;
    }

}