//check whether the number is prime or not

import java.util.Scanner;

public class PrimeNum 
{
	public static void main(String[] args) 
	{
		int m = 0, flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for finding number is prime or not :");
		int number = sc.nextInt();
		m = number / 2;
		if(number == 0 || number == 1)
			System.out.println(number + " is not Prime number.");
		else
		{
			for(int i = 2; i <= m;i++)
			{
				if(number % i == 0)
				{
					System.out.println(number + " is not Prime number.");
					flag = 1;
					break;
				}
			}
			if(flag == 0)
				System.out.println(number + " is Prime Number.");
		}
	}
}
