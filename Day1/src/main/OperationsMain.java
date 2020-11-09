package main;
import service.Operations;

public class OperationsMain {

	public static void main(String[] args) {

Operations operations=new Operations();
operations.a=5;
operations.b=8;
operations.c=6;
operations.d=55;
operations.e=9;
operations.f=20;
operations.g=3;
operations.h=15;
operations.i=2;
System.out.println("Result of operation1 : "+operations.operationA(operations.a, operations.b,operations.c));
System.out.println("Result of operation2 : "+operations.operationB(operations.d,operations.e));
System.out.println("Result of operation3 : "+operations.operationC(operations.a,operations.b,operations.f,operations.g));
System.out.println("Result of operation4 : "+operations.operationD(operations.a,operations.b,operations.g,operations.h,operations.i));

	}

}
