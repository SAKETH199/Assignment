package com.main;

import java.util.Scanner;

import com.pojo.Days;

public class DaysMain {

	public static void main(String[] args) {
		Days days = new Days();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		System.out.println("Enter the month: ");
		int month = sc.nextInt();
		System.out.println(Days.getNumberOfDays(year, month));
		sc.close();
		days = null;
	}

}
