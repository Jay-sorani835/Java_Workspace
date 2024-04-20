package com.a26mar;
/*W.A.J.P to compare a given string to the specified character sequence. Comparing
topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false*/
import java.util.*;

public class CompareStr 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String str = sc.nextLine();
		System.out.println("Enter the second string : ");
		String str1 = sc.nextLine();
		int result = str.compareTo(str1); // Inbuilt Function
		if(result == 0) 
		{
			System.out.println("Strings are same.");
		}
		else
		{
			System.out.println("Strings are not match.");
		}
	}
}
