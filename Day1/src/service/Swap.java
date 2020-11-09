package service;

public class Swap {
	public void Swap(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping value of a is :" + a);
		System.out.println("After swapping value of b :" + b);
	}

}
