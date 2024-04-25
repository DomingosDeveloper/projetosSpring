package com.inMyTime.learningspringframework.game;

public class MarioGame implements GamingConsole{
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("To the hole");
	}
	public void right() {
		System.out.println("Accelerate");
	}
	public void left() {
		System.out.println("Backwards");
	}
}
