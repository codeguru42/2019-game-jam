package codeguru.flappymath.gameobjects;

import com.badlogic.gdx.math.Vector2;

public abstract class Scrollable {
    protected Vector2 position;
    protected Vector2 velocity;
    protected int width;
    protected int height;
    protected boolean isScrolledLeft;

    public Scrollable(float x, float y, int width, int height, float scrollSpeed) {
        this.position = new Vector2(x, y);
        this.velocity = new Vector2(scrollSpeed, 0.0f);
        this.width = width;
        this.height = height;
        this.isScrolledLeft = false;
    }

    public void update(float delta) {
        position.add(velocity.cpy().scl(delta));
        isScrolledLeft = position.x + width < 0;
    }

    public void reset(float x) {
        position.x = x;
        isScrolledLeft = false;
    }

    public boolean isScrolledLeft() {
        return isScrolledLeft;
    }

    public float getTailX() {
        return position.x + width;
    }

    public float getX() {
        return position.x;
    }

    public float getY() {
        return position.y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
