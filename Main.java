package com.demo;

class Sport {
	public void play() {
		System.out.println("playing sport");
	}
}
class Football extends Sport {
	@Override
	public void play() {
		System.out.println("playing football");
	}
}
class Basketball extends Sport {
	@Override
	public void play() {
		System.out.println("playing basketball");
	}
}
class Rugby extends Sport {
	@Override
	public void play() {
		System.out.println("playing rugby");
	}
}
public class Main {
	public static void main(String[] args) {
		Sport sport = new Sport();
		Football football = new Football();
		Basketball basketball = new Basketball();
		Rugby rugby = new Rugby();
		
		sport.play();
		football.play();
		basketball.play();
		rugby.play();
	}
}
