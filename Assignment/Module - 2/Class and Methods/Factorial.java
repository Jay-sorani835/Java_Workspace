package com.a26mar;
/*Write a program to print the factorial of a number by defining a method named
'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*.
*(n-1) *n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also, 1! = 1
0! = 0*/
import java.util.*;

public class Factorial 
{
	int factorial(int n) 
	{
		int fact = 1;
		for(int i = 1;i <= n;i++) 
		{
			fact *= i;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the factorial : ");
		int n = sc.nextInt();
		Factorial f = new Factorial();
		int result = f.factorial(n);
		System.out.println("The factorial of " + n + " is " + result);
	}
}
