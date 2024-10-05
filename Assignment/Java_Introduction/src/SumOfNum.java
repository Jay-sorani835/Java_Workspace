//write a program to make a summation of digits of number

import java.util.Scanner;

public class SumOfNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//get number
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		int sum = 0;
		while(number != 0)
		{
			sum = sum + (number % 10);
			number /= 10;
		}
		System.out.println("The Summation of digits is : " + sum);
	}
}
