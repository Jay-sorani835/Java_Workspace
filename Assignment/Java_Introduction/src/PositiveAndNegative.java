//check the given number is positive or negative

import java.util.Scanner;

public class PositiveAndNegative 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//get data 
		System.out.println("Enter the number to check positive or negative : ");
		int num = sc.nextInt();
		
		if(num >= 0)
		{
			System.out.println(num + " is positive number.");
		}
		else
		{
			System.out.println(num + " is negative number.");
		}
	}
}
