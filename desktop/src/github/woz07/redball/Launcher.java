package github.woz07.redball;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

/**
 * Launcher.java
 *
 * Main entry point of program.
 *
 * @author 	woz07
 * @date 	19/05/2024
 */

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class Launcher
{
	public static void main (String[] arg)
	{
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("Red Ball v1");
		new Lwjgl3Application(new Game(), config);
	}
}
