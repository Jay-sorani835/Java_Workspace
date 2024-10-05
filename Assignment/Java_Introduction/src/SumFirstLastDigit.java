//write a program to find the summation of first and last digit of the given number

import java.util.Scanner;

public class SumFirstLastDigit 
{
	public static int firstDigit(int number)
	{
		while(number >= 10)
		{
			number /= 10;
		}
		return number;
	}
	public static int lastDigit(int number)
	{
		return number % 10;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//get number 
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		//sum of last digit and first digit
		int sum = firstDigit(number) + lastDigit(number);
		System.out.println("The Summation of first digit and last digit of the number is : " + sum);
	}
}
