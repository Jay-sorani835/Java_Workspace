package apr2;
/*W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch
block. try {
try
{//code}
catch (Exception e)
{//code}
catch (Exception e)
{//code}
*/
import java.util.Scanner;

public class NestedTry 
{
	public NestedTry(int a, int b) 
	{
		try 
		{
			try 
			{
				int[] a1 = new int[5];
				int mul = a/b;
				a1[5] = mul;
			}
			catch (ArithmeticException e) 
			{
				System.out.println("The Exception is " + e);
			}
			catch(ArrayIndexOutOfBoundsException e) 
			{
				System.out.println("The exception is "+ e);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
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
