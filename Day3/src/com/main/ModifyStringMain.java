package com.main;

import java.util.Scanner;

import com.pojo.ModifyString;

public class ModifyStringMain {

	public static void main(String[] args) {
		ModifyString modifyString = new ModifyString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String word = sc.nextLine();
		System.out.println(modifyString.getString(word));
		sc.close();
		modifyString = null;
	}

}
