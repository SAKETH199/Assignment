package main;

import service.Multiples;

public class MultiplesMain {

	public static void main(String[] args) {

		Multiples multiple = new Multiples();
		multiple.multiples();
		// System.out.println("Result is :"+ multiple.multiples());
		multiple = null;
	}

}
