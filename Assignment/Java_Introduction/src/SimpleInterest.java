//calculate simple interest
import java.util.Scanner;
public class SimpleInterest 
{
	public static void main(String[] args) {
		
		//get data
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		int amount = sc.nextInt();
		System.out.println("Enter the time : ");
		int time = sc.nextInt();
		System.out.println("Enter the interest rate : ");
		float rate = sc.nextFloat();
		
		//calculate
		double si = (amount * time * rate ) / 100;
		System.out.println("Simple interest is : " + si);

	}
}
