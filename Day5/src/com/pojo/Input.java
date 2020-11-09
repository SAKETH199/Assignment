package com.pojo;

import java.util.Scanner;

public class Input {
	public void input() {
		try {
			Calculate calculate = new Calculate();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Runs Scored: ");
			int runs = sc.nextInt();
			System.out.println("Enter overs: ");
			float overs = sc.nextFloat();
			calculate.calculateRunrate(runs, overs);
			sc.close();
		} catch (Exception e) {
			System.out.println("java.lang.NumberFormatException");
			System.exit(0);
		}
	}

}
