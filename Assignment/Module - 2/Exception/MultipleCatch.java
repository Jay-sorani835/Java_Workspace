package apr2;
/*W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero
exception and another one is to handle
ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;*/
import java.util.Scanner;

public class MultipleCatch 
{
	public MultipleCatch(int a, int b) 
	{
		try 
		{
			int[] a1 = new int[5];
			int mul = a/b;
			a1[5] = mul;
		} 
		catch (ArithmeticException e) 
		{
			// TODO: handle exception
			System.out.println("The Exception is " + e);
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("The exception is "+ e);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the seocnd number :");
		int b = sc.nextInt();
		MultipleCatch m = new MultipleCatch(a, b);
	}
}
