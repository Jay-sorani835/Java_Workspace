package module.j2;
/*Write a program in Java to input 5 numbers from keyboard and find their sum and
average using for loop.*/
import java.util.Scanner;

public class SumNdAvg 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter five element : ");
		for (int i = 0; i < 5; i++)
		{
			sum += sc.nextInt(); //Assignment Operator
		}
		float avg = sum / 5;
		System.out.println("The total sum and avg is " + sum + " and "+ avg);
	}
}
