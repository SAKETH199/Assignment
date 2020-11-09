package service;

public class Prime {
	public String prime(int number) {
		int i, count = 0;
		for (i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return "prime number";
		} else {
			return "Not a prime number";
		}
	}

}
