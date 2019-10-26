package codeguru.flappymath.gameworld;

import codeguru.flappymath.gameobjects.Bird;

public class FlappyMathWorld {
    private static final int BIRD_WIDTH = 17;
    private static final int BIRD_HEIGHT = 12;
    private static final int BIRD_X = 33;
    private Bird bird;

    public FlappyMathWorld(int midPointY) {
        int birdY = midPointY + 5;
        this.bird = new Bird(BIRD_X, birdY, BIRD_WIDTH, BIRD_HEIGHT);
    }

    public void update(float delta) {
        bird.update(delta);
    }

    public Bird getBird() {
        return bird;
    }
}
