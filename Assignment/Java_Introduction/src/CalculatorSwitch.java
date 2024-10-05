//write a program to find addition, subtraction, multiplication, and division using switch case with menu

import java.util.Scanner;
public class CalculatorSwitch 
{
	public static void main(String[] args) 
	{
		while(true)
		{
		System.out.println("Choose to perform: 1.Addition 2.Subtraction 3.Multiplication 4.Division 0.exit");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		Operation op = new Operation();
		switch(choice)
		{
		case 0 :
		break;
		case 1 : System.out.println("Addition is : " + op.add());
		break;
		case 2 : System.out.println("Subtraction is : " + op.sub());
		break;
		case 3 : System.out.println("Multiplication is : " + op.mul());
		break;
		case 4 : System.out.println("Division is : " + op.div());
		break;
		default : System.out.println("Invalid Choice.");
		break;
		}
		break;
		}
	}
}
class Operation
{
	public static int add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value : ");
		int first = sc.nextInt();
		System.out.println("Enter second value : ");
		int second = sc.nextInt();
		
		return first + second;
	}
	public static int sub()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value : ");
		int first = sc.nextInt();
		System.out.println("Enter second value : ");
		int second = sc.nextInt();
		
		return first - second;
	}
	public static int mul()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value : ");
		int first = sc.nextInt();
		System.out.println("Enter second value : ");
		int second = sc.nextInt();
		
		return first * second;
	}
	public static double div()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value : ");
		double first = sc.nextInt();
		System.out.println("Enter second value : ");
		double second = sc.nextInt();
		
		return first / second;
	}
}
