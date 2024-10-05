//write a program to find table of given number

import java.util.Scanner;

public class Table 
{
	public static void main(String[] args) 
	{
		//get data
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of table : ");
		int n = sc.nextInt();
		for(int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + (i) + " = " + (n * i));
		}
	}
}
