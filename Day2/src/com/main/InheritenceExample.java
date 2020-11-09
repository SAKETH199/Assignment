package com.main;

class Cycle {

	String define_me() {

		return "a vehicle with pedals.";

	}

}

class Bike extends Cycle {
	String define_me() {

		return "a cycle with an engine.";

	}

	Bike() {

		System.out.println("Hello I am a Bike I am " + define_me());

		System.out.println("My ancestor is a cycle who is " + super.define_me());

	}

}

class InheritenceExample {

	public static void main(String[] args) {

		Bike M = new Bike();
		M = null;
	}

}
