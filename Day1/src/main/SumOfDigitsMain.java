package main;

import service.SumOfDigits;

import java.util.Scanner;

public class SumOfDigitsMain {

	public static void main(String[] args) {
		SumOfDigits sumOfDigits = new SumOfDigits();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		System.out.println(sumOfDigits.checkSum(num));
		sc = null;
		sumOfDigits = null;

	}
}
