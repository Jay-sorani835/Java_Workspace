package com.a73;
import java.util.Scanner;
public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of table : ");
		int n = sc.nextInt();
		for(int i = 0; i < 10; i++) {
			System.out.println("2 * " + (i+1) + " = " + (n * (i + 1)));
		}
	}
}
