//write a program of to find out the area of Triangle, circle, and rectangle using if condition

import java.util.Scanner;

public class AreaUsingIf 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("what shape area you find? 1.Circle 2.Rectangle 3.Triangle : ");
		int choice = sc.nextInt();
		if(choice == 1)
		{
			System.out.println("Enter the radius of the circle : ");
			float radius = sc.nextFloat();
			System.out.println("Area of circle is : " + Math.PI * radius * radius);
		}
		else if(choice == 2)
		{
			System.out.println("Enter length of the rectangle : ");
			int length = sc.nextInt();
			System.out.println("Enter width of the rectangle : ");
			int width = sc.nextInt();
			System.out.println("Area of the rectangle is : " + length * width);
		}
		else if(choice == 3)
		{
			System.out.println("Enter the first side of the triangle : ");
			int first = sc.nextInt();
			System.out.println("Enter the second side of the triangle : ");
			int second = sc.nextInt();
			System.out.println("Enter the third side of the triangle : ");
			int third = sc.nextInt();
			
			int s = (first + second + third) / 2;
			double area = Math.sqrt(s*(s-first)*(s-second)*(s-third));
			System.out.println("Area of the triagle is : " + area);
		}
		else
		{
			System.out.println("Invalid Choice.");
		}
	}
}
