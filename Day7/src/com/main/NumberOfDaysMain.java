package com.main;

import java.util.Scanner;

import com.pojo.NumberOfDays;

public class NumberOfDaysMain {

	public static void main(String[] args) {
		NumberOfDays numberofDays = new NumberOfDays();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		System.out.println("Enter the month: ");
		int month = sc.nextInt();
		System.out.println(numberofDays.display(year, month));

	}

}
