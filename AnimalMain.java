package com.demo;

class Animal{
	public void move() {
		System.out.println("animal move");
	}
	public void makesound() {
		System.out.println("animal make sound");
	}
}
class Bird extends Animal{
	@Override
	public void move() {
		System.out.println("bird fly");
	}
	@Override
	public void makesound() {
		System.out.println("bird make sound");
	}
}
class Panthera extends Animal{
	@Override
	public void move() {
		System.out.println("Panthera walk");
	}
	@Override
	public void makesound() {
		System.out.println("panthera make sound");
	}
}
public class AnimalMain {
	public static void main(String[] args) {
		Animal bird = new Bird();
		Animal panthera =  new Panthera();
		performAction(bird);
		performAction(panthera);
	}
	public static void performAction(Animal animal) {
		animal.move();
		animal.makesound();
	}
}
