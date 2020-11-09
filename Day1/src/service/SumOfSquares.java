package service;

public class SumOfSquares {

	public static int sumOfSquaresOfEvenDigits(int number) {
		int sumOfSquares = 0;
		int remainder = 0;
		while (number != 0) {
			remainder = number % 10;
			if ((remainder % 2) == 0) {
				sumOfSquares += remainder * remainder;
			}
			number = number / 10;

		}
		return sumOfSquares;
	}
}
