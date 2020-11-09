package service;

public class Multiples {
	public void multiples() {
		int i;
		for (i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println(i + " " + "fizz buzz ");
			} else if (i % 5 == 0) {
				System.out.println(i + " " + "Buzz");
			} else if (i % 3 == 0) {
				System.out.println(i + " " + "Fizz");
			}
		}
	}

}
