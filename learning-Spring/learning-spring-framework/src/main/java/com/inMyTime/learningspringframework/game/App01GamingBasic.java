package com.inMyTime.learningspringframework.game;

public class App01GamingBasic {

	public static void main(String[] args) {

		var marioGame = new MarioGame();
		var superContraGame = new SuperContra();
		
		var gameRunner = new GameRunner(superContraGame);
		
		gameRunner.run();
		}

}
