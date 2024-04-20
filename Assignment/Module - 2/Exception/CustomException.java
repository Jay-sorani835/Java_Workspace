package apr2;
/*W.A.J.P to create a custom exception if Customer withdraw amount which is greater
than account balance then program will show custom exception otherwise amount
will deduct from account balance. Account balance is: 2000 Enter withdraw amount:
2500
Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.*/
import java.util.Scanner;

class InSufficientException extends Exception
{
	double amount;
	public InSufficientException(double amount)
	{
		this.amount = amount;
	}
	double getAmount() 
	{
		return amount;
	}
}
public class CustomException 
{
	double bal,amount;
	public CustomException() throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your balance : ");
		bal = sc.nextDouble();
		System.out.println("Enter the withdrawal amount : ");
		amount = sc.nextDouble();
		try 
		{
			double balance = bal - amount;
			transection();
		} catch (InSufficientException e) 
		{
			System.out.println("You have no sufficient balance, You need more  "+e.getAmount());
		}
	}
	void transection() throws Exception
	{
		if(amount<=bal) 
		{
			bal = bal - amount;
		}
		else 
		{
			double needs = amount-bal;
			throw new InSufficientException(needs);
		}
	}
	public static void main(String[] args) throws Exception 
	{
		CustomException e = new CustomException();
	}
}
