package com.main;

import java.util.Scanner;
import com.pojo.myCalculator;

public class MyCalculatorMain {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);

		while (in.hasNextInt()) {
			// System.out.println("Enter value of n: ");
			int n = in.nextInt();
			// System.out.println("Enter value of p: ");
			int p = in.nextInt();
			myCalculator M = new myCalculator();
			try {
				System.out.println(M.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		in.close();
	}
}
