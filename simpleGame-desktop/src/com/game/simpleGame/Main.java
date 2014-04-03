package com.game.simpleGame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "simpleGame";
		cfg.width = 480;
		cfg.height = 320;
		
		new LwjglApplication(new Game(), cfg);
	}
}