package com.demo;

abstract class Vehicle {
	  public abstract void startEngine();
	  public abstract void stopEngine();
}
class Car extends Vehicle {
	  @Override
	  public void startEngine() {
		  System.out.println("Car engine started");
	  }

	  @Override
	  public void stopEngine() {
		  System.out.println("Car engine stopped");
	  }
}
class Motorcycle extends Vehicle {
	  @Override
	  public void startEngine() {
		  System.out.println("Motorcycle engine started");
	  }

	  @Override
	  public void stopEngine() {
		  System.out.println("Motorcycle engine stopped");
	  }
}

public class VehicleMain {
	public static void main(String[] args) {
		Vehicle car = new Car();
	    Vehicle motorcycle = new Motorcycle();
	    startAndStopEngine(car);
	    startAndStopEngine(motorcycle);
	  }

	 public static void startAndStopEngine(Vehicle vehicle) {
		 vehicle.startEngine();
		 vehicle.stopEngine();
	  }
}
