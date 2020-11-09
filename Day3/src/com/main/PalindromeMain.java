package com.main;

import java.util.Scanner;

import com.pojo.Palindrome;

public class PalindromeMain {

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String word = sc.nextLine();
		System.out.println(palindrome.checkPalindrome(word));
		sc.close();
		palindrome = null;
	}

}
