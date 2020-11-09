package com.main;

import java.util.Scanner;

import com.pojo.Pangram;

public class PangramMain {

	public static void main(String[] args) {
		Pangram pangram = new Pangram();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String sentence = sc.nextLine();
		System.out.println(pangram.checkPangram(sentence));
		sc.close();
		pangram = null;

	}

}
