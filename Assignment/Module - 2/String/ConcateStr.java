package com.a26mar;
//W.A.J.P to concatenate a given string to the end of another string.
import java.util.*;

public class ConcateStr 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String str = sc.nextLine();
		System.out.println("Enter the second string : ");
		String str1 = sc.nextLine();
		String result = str.concat(str1); //concate a string str with str1
		System.out.println(result);
	}
}
