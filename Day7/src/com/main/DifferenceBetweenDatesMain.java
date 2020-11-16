package com.main;

import java.text.ParseException;
import java.util.Scanner;

import com.pojo.DifferenceBetweenDates;

public class DifferenceBetweenDatesMain {
	public static void main(String[] args) {
		DifferenceBetweenDates differenceBetweenDates = new DifferenceBetweenDates();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date1: ");
		String date1 = sc.nextLine();
		System.out.println("Enter the date2: ");
		String date2 = sc.nextLine();
		try {
			System.out.println("Difference in months: " + DifferenceBetweenDates.getMonthDifference(date1, date2));
		} catch (ParseException pe) {
			System.out.println(pe);
		}
		sc.close();
		differenceBetweenDates = null;
	}
}
