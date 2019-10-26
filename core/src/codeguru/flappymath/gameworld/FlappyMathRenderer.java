package codeguru.flappymath.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import codeguru.flappymath.gameobjects.Bird;
import codeguru.flappymath.helpers.AssetLoader;

public class FlappyMathRenderer {
    private static final int GROUND_HEIGHT = 52;
    private static final int GRASS_HEIGHT = 11;

    private final FlappyMathWorld world;
    private final int gameWidth;
    private OrthographicCamera camera = new OrthographicCamera();
    private ShapeRenderer shapeRenderer = new ShapeRenderer();
    private SpriteBatch batch = new SpriteBatch();

    private int gameHeight;

    private Color skyColor = new Color(128.0f / 255.0f, 209.0f / 255.0f, 230.0f / 255.0f, 1.0f);
    private Color grassColor = new Color(111 / 255.0f, 186 / 255.0f, 45 / 255.0f, 1);
    private Color groundColor = new Color(147 / 255.0f, 80 / 255.0f, 27 / 255.0f, 1);

    public FlappyMathRenderer(FlappyMathWorld world, int gameHeight) {
        this.world = world;
        this.gameWidth = 136;
        this.gameHeight = gameHeight;
        this.camera.setToOrtho(false, this.gameWidth, this.gameHeight);
        this.batch.setProjectionMatrix(camera.combined);
        this.shapeRenderer.setProjectionMatrix(camera.combined);
    }

    public void render(float runTime) {
        Gdx.gl.glClearColor(128.0f / 255.0f, 209.0f / 255.0f, 230.0f / 255.0f, 1.0f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(grassColor);
        shapeRenderer.rect(0, GROUND_HEIGHT, gameWidth, GRASS_HEIGHT);
        shapeRenderer.setColor(groundColor);
        shapeRenderer.rect(0, 0, gameWidth, GROUND_HEIGHT);
        shapeRenderer.end();

        Bird bird = world.getBird();
        batch.begin();
        batch.disableBlending();
        batch.draw(AssetLoader.bg, 0, GROUND_HEIGHT + GRASS_HEIGHT, gameWidth, 43);
        batch.enableBlending();
        batch.draw(AssetLoader.birdAnimation.getKeyFrame(runTime), bird.getX(), bird.getY(), bird.getWidth(), bird.getHeight());
        batch.end();
    }
}
