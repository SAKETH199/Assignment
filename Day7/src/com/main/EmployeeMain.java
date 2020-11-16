package com.main;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

import com.pojo.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employees = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees: ");
		int numberOfEmployees = Integer.parseInt(sc.nextLine());
		LinkedHashMap<String, String> employee = new LinkedHashMap<String, String>();
		for (int i = 0; i < numberOfEmployees; i++) {
			System.out.println("Enter the name: ");
			String name = sc.nextLine();
			System.out.println("Enter the designation: ");
			String designation = sc.nextLine();
			employee.put(name, designation);
		}
		System.out.println("Enter the designation to be searched :");
		String searchByDesignation = sc.nextLine();
		LinkedHashMap<String, String> employeeNames = new LinkedHashMap<String, String>();
		employeeNames = employees.obtainDesignation(employee, searchByDesignation);
		Iterator<String> it = employeeNames.keySet().iterator();
		System.out.println("Employees found in the given designation :");
		while (it.hasNext()) {
			String s2 = it.next();
			System.out.println(s2);
		}
		sc.close();
	}

}
