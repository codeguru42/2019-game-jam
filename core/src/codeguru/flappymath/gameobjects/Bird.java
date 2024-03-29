package codeguru.flappymath.gameobjects;

import com.badlogic.gdx.math.Vector2;

public class Bird {
    private static final int ACCELERATION_Y = -460;
    private static final int CLICK_VELOCITY_Y = 140;
    private static final int MAXIMUM_ROTATION = 20;
    private static final int MINIMUM_ROTATION = -90;
    private static final int MINIMUM_VELOCITY = -200;

    private Vector2 position;
    private Vector2 velocity;
    private Vector2 acceleration;

    private float rotation;
    private int width;
    private int height;

    public Bird(float x, float y, int width, int height) {
        this.position = new Vector2(x, y);
        this.width = width;
        this.height = height;
        this.velocity = new Vector2(0, 0);
        this.acceleration = new Vector2(0, ACCELERATION_Y);
    }

    public void update(float delta) {
        velocity.add(acceleration.cpy().scl(delta));

        if (velocity.y < MINIMUM_VELOCITY) {
            velocity.y = MINIMUM_VELOCITY;
        }

        position.add(velocity.cpy().scl(delta));

        if (position.y < 0) {
            position.set(position.x, 200.0f);
        }

        if (velocity.y > 0) {
            rotation += 600 * delta;

            if (rotation > MAXIMUM_ROTATION) {
                rotation = MAXIMUM_ROTATION;
            }
        }

        if (isFalling()) {
            rotation -= 480 * delta;
            if (rotation < MINIMUM_ROTATION) {
                rotation = MINIMUM_ROTATION;
            }
        }
    }

    public void onClick() {
        velocity.y = CLICK_VELOCITY_Y;
    }

    public float getX() {
        return position.x;
    }

    public float getY() {
        return position.y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getRotation() {
        return rotation;
    }

    public boolean isFalling() {
        return velocity.y < -110;
    }

    public boolean shouldntFlap() {
        return velocity.y < -70;
    }
}
