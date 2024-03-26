package com.a26mar;

import java.util.*;

public class PrintCharInt {

	static void print(int a, char c) {
		System.out.println("The sequence is " + a + " and " + c);
	}
	static void print(char c, int a) {
		System.out.println("The sequence is " + c + " and " + a);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		System.out.println("Enter the character : ");
		char c = sc.next().charAt(0);
		print(a,c);
		print(c,a);
	}
}
