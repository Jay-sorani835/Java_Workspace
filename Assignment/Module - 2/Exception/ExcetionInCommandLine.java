package apr11;

import java.util.Scanner;

/*W.A.J. P to demonstrate try catch block, take two numbers from the user by
Command line argument and perform the division operation and handle Arithmetic*/
public class ExcetionInCommandLine 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value : ");
		int a = sc.nextInt();
		System.out.println("Enter the second value : ");
		int b = sc.nextInt();
		try {
			int d = a / b;
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
