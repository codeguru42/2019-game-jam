package codeguru.flappymath.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;

import codeguru.flappymath.gameworld.FlappyMathRenderer;
import codeguru.flappymath.gameworld.FlappyMathWorld;
import codeguru.flappymath.helpers.InputHandler;

public class FlappyMathScreen extends ScreenAdapter {

    private FlappyMathWorld world;
    private FlappyMathRenderer renderer;
    private float runTime = 0.0f;

    public FlappyMathScreen() {
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);

        int midPointY = (int) (gameHeight / 2);

        world = new FlappyMathWorld(midPointY);
        renderer = new FlappyMathRenderer(world, (int)gameHeight);

        Gdx.input.setInputProcessor(new InputHandler(world.getBird()));
    }

    @Override
    public void render(float delta) {
        runTime += delta;
        world.update(delta);
        renderer.render(runTime);
    }
}
