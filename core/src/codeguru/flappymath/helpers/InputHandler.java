package codeguru.flappymath.helpers;

import com.badlogic.gdx.InputAdapter;

import codeguru.flappymath.gameobjects.Bird;

public class InputHandler extends InputAdapter {
    private Bird bird;

    public InputHandler(Bird bird) {
        this.bird = bird;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        bird.onClick();
        return true;
    }
}
