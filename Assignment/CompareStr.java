package com.a26mar;

import java.util.*;

public class CompareStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String str = sc.next();
		System.out.println("Enter the second string : ");
		String str1 = sc.next();
		int result = str.compareTo(str1);
		if(result == 0) {
			System.out.println("Strings are same.");
		}
		else
		{
			System.out.println("Strings are not match.");
		}
	}
	
}
