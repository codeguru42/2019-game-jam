package codeguru.flappymath.helpers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetLoader {
    private static Texture bgTexture;
    private static Texture grassTexture;
    private static Texture birdTexture, birdUpTexture, birdDownTexture;
    private static Texture pipeEndTexture, pipeTexture;

    public static TextureRegion bg;
    public static TextureRegion grass;
    public static TextureRegion bird, birdUp, birdDown;
    public static Animation<TextureRegion> birdAnimation;
    public static TextureRegion pipeUp, pipeDown, pipe;

    public static void load() {
        grassTexture = new Texture("grass.png");
        bgTexture = new Texture("bg.png");
        birdTexture = new Texture("bird.png");
        birdUpTexture = new Texture("bird-up.png");
        birdDownTexture = new Texture("bird-down.png");
        pipeEndTexture = new Texture("pipe-end.png");
        pipeTexture = new Texture("pipe.png");

        bg = new TextureRegion(bgTexture);
        grass = new TextureRegion(grassTexture);
        bird = new TextureRegion(birdTexture);
        birdUp = new TextureRegion(birdUpTexture);
        birdDown = new TextureRegion(birdDownTexture);
        TextureRegion[] birds = {birdDown, bird, birdUp};
        birdAnimation = new Animation<>(0.06f, birds);
        birdAnimation.setPlayMode(Animation.PlayMode.LOOP_PINGPONG);
        pipeUp = new TextureRegion(pipeEndTexture);
        pipeDown = new TextureRegion(pipeEndTexture);
        pipeDown.flip(false, true);
        pipe = new TextureRegion(pipeTexture);
    }

    public static void dispose() {
        bgTexture.dispose();
        grassTexture.dispose();
        birdTexture.dispose();
        birdUpTexture.dispose();
        birdDownTexture.dispose();
        pipeTexture.dispose();
        pipeTexture.dispose();
    }
}
