package com.pojo;

public class Palindrome {
	private String reverse = "";

	public String checkPalindrome(String orginalString) {
		for (int i = orginalString.length() - 1; i >= 0; i--) {
			reverse += orginalString.charAt(i);
		}
		if (orginalString.equals(reverse)) {
			return "Palindrome";
		} else {
			return "Not an palindrome";
		}
	}

}
