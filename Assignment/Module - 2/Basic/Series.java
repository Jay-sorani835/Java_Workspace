package module.j2;

import java.util.Scanner;

//Write a Java program that accepts an integer (n) and computes the value of
//n+nn+nnn. Input number: 5
//5 + 55 + 555
public class Series 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nummber : ");
		int a = sc.nextInt();
		for(int i = 1;i <= 3;i++) 
		{
			for(int j = 0;j < i;j++) 
			{
			
				System.out.print(a);
			}
			if(i == 3) 
			{
				break;
			}
			System.out.print(" + ");
		}
	}
}
