package com.upskill.tutedude.assignments2;

public class Dog extends Animal implements Playable {
	 
	@Override
	public void sound() {
	System.out.println("Dog makes a sound: Woof");
	}

	@Override
	public void play() {
	System.out.println("Dog can play: Yes");
	}
	
}