package codeguru.flappymath.screens;

import com.badlogic.gdx.Screen;

import codeguru.flappymath.gameworld.FlappyMathRenderer;
import codeguru.flappymath.gameworld.FlappyMathWorld;

public class FlappyMathScreen implements Screen {

    private FlappyMathWorld world = new FlappyMathWorld();
    private FlappyMathRenderer renderer = new FlappyMathRenderer(world);

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        world.update(delta);
        renderer.render();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
