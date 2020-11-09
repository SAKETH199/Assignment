package com.main;

import java.util.Scanner;

import com.hcl.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
	Calculator calculator=new Calculator();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value for a: ");
	int a =sc.nextInt();
	System.out.println("Enter value for b: ");
	int b=sc.nextInt();
	System.out.println(calculator.add(a, b));
	sc.close();
	calculator=null;
	

	}

}
