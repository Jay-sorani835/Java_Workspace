package com.a26mar;
/*Create a class named 'Member' having the following members:
1. Data members
2. Name
3. Age
4. Phone number
5. Address
6. Salary
It also has a method named 'printSalary' which prints the salary of the members.*/
import java.util.Scanner;

public class Member 
{
	String name,address;
	int age,Phone_num;
	double salary;
	static void PrintSalary(Member a) 
	{
		System.out.println("The salary of " + a.name + " is " + a.salary);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Member m = new Member();
		Member n = new Member();
		
		//get the data from user
		System.out.println("Enter the name , age, phone number, address, and salary of tbe first person : ");
		m.name = sc.next();
		m.age = sc.nextInt();
		m.Phone_num = sc.nextInt();
		m.address = sc.next();
		m.salary = sc.nextDouble();
		
		//taking data of second object
		System.out.println("Enter the name , age, phone number, address, and salary of tbe second person : ");
		n.name = sc.next();
		n.age = sc.nextInt();
		n.Phone_num = sc.nextInt();
		n.address = sc.next();
		n.salary = sc.nextDouble();
		
		PrintSalary(m);
		PrintSalary(n);	
	}
}
