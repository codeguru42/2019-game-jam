package codeguru.flappymath.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;

public class FlappyMathRenderer {
    private final FlappyMathWorld world;
    private OrthographicCamera camera = new OrthographicCamera();
    private ShapeRenderer renderer = new ShapeRenderer();

    public FlappyMathRenderer(FlappyMathWorld world) {
        this.world = world;
        this.camera.setToOrtho(true, 135, 203);
        this.renderer.setProjectionMatrix(camera.combined);
    }

    public void render() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        renderer.begin(ShapeRenderer.ShapeType.Filled);
        renderer.setColor(87 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);
        Rectangle rect = world.getRect();
        renderer.rect(rect.x, rect.y, rect.width, rect.height);
        renderer.end();
    }
}
