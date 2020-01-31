package org.scan;

import java.util.Scanner;

public class EmployeeDetails {
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("Please enter Employee ID");
	int empID= sc.nextInt();
	System.out.println("Please enter Employee Name");
	String empName= sc.next();
	System.out.println("Please enter Employee Email");
	String empEmail= sc.next();
	System.out.println("Please enter Employee Phone number");
	Long empPhoneno= sc.nextLong();
	System.out.println("Please enter Employee Salary");
	Double empSalary= sc.nextDouble();
	System.out.println("Please enter Employee Gender");
	String empGender= sc.next();
	System.out.println("Please enter Employee City");
	String empCity= sc.next();
}
}
