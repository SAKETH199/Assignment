package com.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExtractDate {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date: ");
		String DateFormat = sc.nextLine();

		Date dateNew = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(DateFormat);
		System.out.println(DateFormat + "\t" + dateNew);
		sc.close();
	}
}