package chapter10;

import com.jme3.app.SimpleApplication;
import com.jme3.audio.AudioNode;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

/**
 * This demo shows the difference between streamed (a long quiet nature sound) 
 * and buffered audio (a short loud foot step sound).
 * @author zathras
 */
public class BufferedVsStreamed extends SimpleApplication {

  private AudioNode nature_audio, steps_audio;

  public static void main(String[] args) {
    BufferedVsStreamed test = new BufferedVsStreamed();
    test.start();
  }

  @Override
  public void simpleInitApp() {
    flyCam.setMoveSpeed(50f);
    initScene();

    // load as prebuffered sound (streaming=false)
    steps_audio = new AudioNode(assetManager,
            "Sounds/Effects/Foot steps.ogg", false);
    steps_audio.setVolume(2);
    steps_audio.setLooping(true);
    steps_audio.play(); // play as prebuffered instance

    // load as streamed sound (streaming=true)
    nature_audio = new AudioNode(assetManager,
            "Sounds/Environment/Nature.ogg", true);
    nature_audio.setVolume(10);
    nature_audio.play();

  }

  /**
    * just a blue box floating in space
    */
  private void initScene() {
    Box box1 = new Box(Vector3f.ZERO, 1, 1, 1);
    Geometry player = new Geometry("Player", box1);
    Material mat1 = new Material(assetManager,
            "Common/MatDefs/Misc/Unshaded.j3md");
    mat1.setColor("Color", ColorRGBA.Blue);
    player.setMaterial(mat1);
    rootNode.attachChild(player);
  }
}