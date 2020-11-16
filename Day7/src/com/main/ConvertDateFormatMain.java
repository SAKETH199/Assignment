package com.main;

import java.text.ParseException;
import java.util.Scanner;

import com.pojo.ConvertDateFormat;

public class ConvertDateFormatMain {

	public static void main(String[] args) {
	ConvertDateFormat convertDateFormat=new ConvertDateFormat();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the date: ");
	String date=sc.nextLine();
	try
	{
	System.out.println("Changed date format :"+ConvertDateFormat.convertDateFormat(date));
	sc.close();
	convertDateFormat=null;
	}
	catch(ParseException pe)
	{
		System.out.println(pe);
	}
	}

}
