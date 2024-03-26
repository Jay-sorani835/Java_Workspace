package com.a26mar;

import java.util.*;

public class ConcateStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String str = sc.next();
		System.out.println("Enter the second string : ");
		String str1 = sc.next();
		String result = str.concat(str1);
		System.out.println(result);
	}
	
}
