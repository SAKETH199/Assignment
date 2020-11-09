package com.main;

import java.util.Scanner;

import com.pojo.Cricket;
import com.pojo.UserDefinedException;

public class CricketMain {
	public static void main(String[] args) {
		Cricket cricket=new Cricket();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player name: ");
		String playerName=sc.nextLine();
		System.out.println("Enter the player age: ");
		int playerAge=sc.nextInt();
		boolean valid;
		try
		{
			valid=cricket.validateAge(playerAge);
			System.out.println("Player name : "+playerName);
			System.out.println("Player age : "+playerAge);
		}
		catch(UserDefinedException ude)
		{
			System.err.println(ude.getMessage());
		}
		cricket=null;
	}

}
