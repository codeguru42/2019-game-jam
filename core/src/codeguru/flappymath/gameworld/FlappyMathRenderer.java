package codeguru.flappymath.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import codeguru.flappymath.gameobjects.Bird;
import codeguru.flappymath.helpers.AssetLoader;

public class FlappyMathRenderer {
    private final FlappyMathWorld world;
    private OrthographicCamera camera = new OrthographicCamera();
    private ShapeRenderer shapeRenderer = new ShapeRenderer();
    private SpriteBatch batch = new SpriteBatch();

    private int midPointY;
    private int gameHeight;

    public FlappyMathRenderer(FlappyMathWorld world, int gameHeight, int midPointY) {
        this.world = world;
        this.gameHeight = gameHeight;
        this.midPointY = midPointY;
        this.camera.setToOrtho(true, 135, gameHeight);
        this.batch.setProjectionMatrix(camera.combined);
        this.shapeRenderer.setProjectionMatrix(camera.combined);
    }

    public void render(float runTime) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(111 / 255.0f, 186 / 255.0f, 45 / 255.0f, 1);
        shapeRenderer.rect(0, midPointY + 66, 136, 11);
        shapeRenderer.setColor(147 / 255.0f, 80 / 255.0f, 27 / 255.0f, 1);
        shapeRenderer.rect(0, midPointY + 77, 136, 52);
        shapeRenderer.end();

        Bird bird = world.getBird();
        batch.begin();
        batch.disableBlending();
        batch.draw(AssetLoader.bg, 0, midPointY + 23, 136, 43);
        batch.enableBlending();
        batch.draw(AssetLoader.birdAnimation.getKeyFrame(runTime), bird.getX(), bird.getY(), bird.getWidth(), bird.getHeight());
        batch.end();
    }
}
