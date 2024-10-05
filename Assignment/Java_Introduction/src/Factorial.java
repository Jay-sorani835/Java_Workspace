//write a program to find the factorial of given number

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//get number 
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		int fact = 1;
		for(int i = 1;i <= number;i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is "  + fact);
	}
}
