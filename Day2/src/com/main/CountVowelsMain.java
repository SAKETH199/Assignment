package com.main;

import java.util.Scanner;

import com.pojo.CountVowels;

public class CountVowelsMain {

	public static void main(String[] args) {
		CountVowels countVowels = new CountVowels();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String word = sc.nextLine();
		System.out.println("Number of vowels in the string :" + countVowels.countVowels(word));
		sc = null;
		countVowels = null;
	}

}
