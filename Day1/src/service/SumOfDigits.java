package service;

public class SumOfDigits {
	public static int checkSum(int number) {
		int lastDigit = 0;
		int oddDigitSum = 0;
		while (number != 0) {
			lastDigit = number % 10;
			if ((lastDigit % 2) != 0) {
				oddDigitSum += lastDigit;
			}
			number = number / 10;
		}
		if ((oddDigitSum % 2) != 0) {
			return 1;
		} else {
			return -1;
		}
	}

}
