package codeguru.flappymath;

import com.badlogic.gdx.Game;

import codeguru.flappymath.screens.FlappyMathScreen;

public class FlappyMathGame extends Game {
	@Override
	public void create () {
		setScreen(new FlappyMathScreen());
	}
}
