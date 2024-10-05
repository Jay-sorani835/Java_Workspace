//write a program to find the fibonacci series

import java.util.Scanner;

public class FibonacciSeries 
{
	private static int n1 = 0, n2 = 1, n3 = 0;
	
	//find fibonacci series
	public static void printFibonacci(int count)
	{
		if(count > 0)
		{
			n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibonacci(count - 1);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for finding fibonacci serires upto that term : ");
		int count = sc.nextInt();
		//fibonacci series 
		System.out.print(n1 + " " + n2);
		printFibonacci(count - 2);
	}
}
