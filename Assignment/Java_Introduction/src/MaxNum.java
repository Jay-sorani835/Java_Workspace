//write a program to find out maximum number from the given number

import java.util.Scanner;

public class MaxNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//get number
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int max = 0;
		while(num != 0)
		{
			int temp = num % 10;
			if(temp > max)
				max = temp;
			num = num / 10;
		}
		System.out.println("Maximum number from the given number is : " + max);
	}
}
