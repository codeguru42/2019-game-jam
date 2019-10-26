package codeguru.flappymath.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import codeguru.flappymath.FlappyMathGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Flappy Math";
		config.height = 203*3;
		config.width = 135*3;
		new LwjglApplication(new FlappyMathGame(), config);
	}
}
