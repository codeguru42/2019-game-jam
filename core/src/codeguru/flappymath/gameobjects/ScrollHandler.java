package codeguru.flappymath.gameobjects;

public class ScrollHandler {
    private Grass frontGrass, backGrass;

    private static final int SCROLL_SPEED = -59;

    public ScrollHandler(float y) {
        frontGrass = new Grass(
            0.0f,
            52.0f,
            143,
            11,
            SCROLL_SPEED
        );
        backGrass = new Grass(
            frontGrass.getTailX(),
            52.0f,
            143,
            11,
            SCROLL_SPEED
        );
    }

    public void update(float delta) {
        frontGrass.update(delta);
        backGrass.update(delta);

        if (frontGrass.isScrolledLeft()) {
            frontGrass.reset(backGrass.getTailX());
        } else if (backGrass.isScrolledLeft()) {
            backGrass.reset(frontGrass.getTailX());
        }
    }

    public Grass getFrontGrass() {
        return frontGrass;
    }

    public Grass getBackGrass() {
        return backGrass;
    }
}
