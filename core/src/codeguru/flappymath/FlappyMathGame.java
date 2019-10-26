package codeguru.flappymath;

import com.badlogic.gdx.Game;

import codeguru.flappymath.helpers.AssetLoader;
import codeguru.flappymath.screens.FlappyMathScreen;

public class FlappyMathGame extends Game {
	@Override
	public void create () {
		AssetLoader.load();
		setScreen(new FlappyMathScreen());
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}
}
