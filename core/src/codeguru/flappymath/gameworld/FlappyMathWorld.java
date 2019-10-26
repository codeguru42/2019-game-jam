package codeguru.flappymath.gameworld;

import codeguru.flappymath.gameobjects.Bird;
import codeguru.flappymath.gameobjects.ScrollHandler;

public class FlappyMathWorld {
    private static final int BIRD_WIDTH = 17;
    private static final int BIRD_HEIGHT = 12;
    private static final int BIRD_X = 33;

    private Bird bird;
    private ScrollHandler scroller;

    public FlappyMathWorld(int midPointY) {
        int birdY = midPointY + 5;
        this.bird = new Bird(BIRD_X, birdY, BIRD_WIDTH, BIRD_HEIGHT);
        this.scroller = new ScrollHandler(midPointY - 66);
    }

    public void update(float delta) {
        bird.update(delta);
        scroller.update(delta);
    }

    public Bird getBird() {
        return bird;
    }

    public ScrollHandler getScroller() {
        return scroller;
    }
}
