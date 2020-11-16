package com.main;

import java.util.Scanner;

import com.pojo.IPValidation;

public class IPValidationMain {

	public static void main(String[] args) {
		IPValidation ipValidation = new IPValidation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the IP address :");
		String ipAddress = sc.nextLine();
		int result = IPValidation.ipValidator(ipAddress);
		if (result == 1) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
		sc.close();
		ipValidation = null;
	}

}
