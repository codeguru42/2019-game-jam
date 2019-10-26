package codeguru.flappymath;

import com.badlogic.gdx.math.Rectangle;

public class FlappyMathWorld {
    private Rectangle rect = new Rectangle(0, 0, 17, 12);

    public void update(float delta) {
        rect.x++;
        if (rect.x > 137) {
            rect.x = 0;
        }
    }

    public Rectangle getRect() {
        return rect;
    }
}
