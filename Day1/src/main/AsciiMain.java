package main;

import java.util.Scanner;

import service.Ascii;

public class AsciiMain {

	public static void main(String[] args) {
		Ascii ascii = new Ascii();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character : ");
		char ch = sc.next().charAt(0);
		System.out.println("The acii value of given character :" + ascii.asciiValue(ch));

	}

}
