package com.a26mar;

import java.util.*;

public class Factorial {
	int factorial(int n) {
		int fact = 1;
		for(int i = 1;i <= n;i++) {
			fact *= i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the factorial : ");
		int n = sc.nextInt();
		Factorial f = new Factorial();
		int result = f.factorial(n);
		System.out.println("The factorial of " + n + " is " + result);
	}
}
