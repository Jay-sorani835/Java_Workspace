package com.a26mar;
/*Create a class to print an integer and a character with two methods having the same
name but different sequence of the integer and the character parameters. For
example, if the parameters of the first method are of the form (int n, char c), then
that of the second method will be of the form (char c, int n).*/
import java.util.*;

public class PrintCharInt 
{
	static void print(int a, char c) 
	{
		System.out.println("The sequence is " + a + " and " + c);
	}
	static void print(char c, int a) 
	{
		System.out.println("The sequence is " + c + " and " + a);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		System.out.println("Enter the character : ");
		char c = sc.next().charAt(0);
		print(a,c);
		print(c,a);
	}
}
