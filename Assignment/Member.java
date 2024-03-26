package com.a26mar;

import java.util.Scanner;

public class Member {
	String name,Phone_num,address;
	int age;
	double salary;
	static void PrintSalary(Member a) {
		System.out.println("The salary of " + a.name + " is " + a.salary);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member m = new Member();
		System.out.println("Enter the name , age, phone number, address, and salary of tbe first person : ");
		m.name = sc.next();
		m.age = sc.nextInt();
		m.Phone_num = sc.next();
		m.address = sc.next();
		m.salary = sc.nextDouble();
		Member n = new Member();
		System.out.println("Enter the name , age, phone number, address, and salary of tbe second person : ");
		n.name = sc.next();
		n.age = sc.nextInt();
		n.Phone_num = sc.next();
		n.address = sc.next();
		n.salary = sc.nextDouble();
		
		PrintSalary(m);
		PrintSalary(n);	
	}
	
}
