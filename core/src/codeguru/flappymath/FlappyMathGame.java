package codeguru.flappymath;

import com.badlogic.gdx.Game;

public class FlappyMathGame extends Game {
	@Override
	public void create () {
		setScreen(new FlappyMathScreen());
	}
}
