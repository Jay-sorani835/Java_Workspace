package apr2;
/*W.A.J.P to create the validate method that takes integer value as a parameter. If the
age is less than 18, then throw an Arithmetic Exception otherwise print a message
welcome to vote.
O/P- Enter your age: 16
Exception in thread main java. Lang. Arithmetic Exception: not valid*/
import java.util.Scanner;

public class VoteException
{
	public static void main(String[] args)  
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : " );
		int age = sc.nextInt();
		try {
			if(age < 18) 
			{
				throw new ArithmeticException("Sorry your age is not prefer for voting."); 	//new Exception	
			}
			else
			{
				System.out.println("Welcome for Voting.");
			}
		}
		catch (ArithmeticException e) 
		{
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
