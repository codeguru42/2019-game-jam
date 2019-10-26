package codeguru.flappymath.gameworld;

import codeguru.flappymath.gameobjects.Bird;

public class FlappyMathWorld {
    private Bird bird;

    public FlappyMathWorld(int midPointY) {
        this.bird = new Bird(33, midPointY - 5, 17, 12);
    }

    public void update(float delta) {
        bird.update(delta);
    }

    public Bird getBird() {
        return bird;
    }
}
