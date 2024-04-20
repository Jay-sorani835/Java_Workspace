package apr2;
/*Take two numbers from the user and perform the division operation and handle
Arithmetic Exception. O/P- Enter two numbers: 10 0
Exception in thread main java.lang.ArithmeticException:/ by zero*/
import java.util.*;

public class ArithmaticException 
{
	public ArithmaticException(int a ,int b)
	{
		// TODO Auto-generated constructor stub
		try 
		{
			int div = a / b;
			System.out.println("The Division of two number is " + div);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("The Exception is " + e);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a = sc.nextInt();
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		ArithmaticException ar = new  ArithmaticException(a, b);
	}
}
