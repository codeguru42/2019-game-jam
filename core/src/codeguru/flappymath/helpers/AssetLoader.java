package codeguru.flappymath.helpers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;

public class AssetLoader {
    public static Texture bg;
    public static Texture grass;
    public static Animation<Texture> birdAnimation;
    public static Texture bird, birdUp, birdDown;

    public static void load() {
        bg = new Texture("bg.png");
        grass = new Texture("grass.png");
        bird = new Texture("bird.png");
        birdUp = new Texture("bird-up.png");
        birdDown = new Texture("bird-down.png");

        Texture[] birds = {birdDown, bird, birdUp};
        birdAnimation = new Animation<Texture>(0.06f, birds);
        birdAnimation.setPlayMode(Animation.PlayMode.LOOP_PINGPONG);
    }

    public static void dispose() {
        bg.dispose();
        grass.dispose();
        bird.dispose();
        birdUp.dispose();
        birdDown.dispose();
    }
}
