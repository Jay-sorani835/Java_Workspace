//write a program to display monday to sunday using switch case

import java.util.Scanner;

public class Calender 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//get number from user
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		switch (number)
		{
		case 1 : System.out.println("Monday");
		break;
		case 2 : System.out.println("Tuesday");
		break;
		case 3 : System.out.println("Wednesday");
		break;
		case 4 : System.out.println("Thrusday");
		break;
		case 5 : System.out.println("Friday");
		break;
		case 6 : System.out.println("Saturday");
		break;
		case 7 : System.out.println("Sunday");
		break;
		default : System.out.println("Unexpected value.");
		}
	}
}
