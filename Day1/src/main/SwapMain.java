package main;

import java.util.Scanner;

import service.Swap;

public class SwapMain {

	public static void main(String[] args) {
		Swap swap = new Swap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of variable1: ");
		int variable1 = sc.nextInt();
		System.out.println("Enter value of variable2: ");
		int variable2 = sc.nextInt();
		swap.Swap(variable1, variable2);

	}

}
