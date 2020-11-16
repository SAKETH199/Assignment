package com.main;

import java.text.ParseException;
import java.util.Scanner;

import com.pojo.CompareTwoDates;

public class CompareTwoDatesMain {
	public static void main(String[] args) {
		
	CompareTwoDates compareTwoDates=new CompareTwoDates();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the date1: ");
	String date1=sc.nextLine();
	System.out.println("Enter the date2: ");
	String date2=sc.nextLine();
	try
	{
	System.out.println("Older date is : "+CompareTwoDates.findOldDate(date1, date2));
	compareTwoDates=null;
	sc.close();
	}
	catch(ParseException pe)
	{
		System.out.println(pe);
	}

}
}