package module.j2;
/*Create a class to print the area of a square and a rectangle. The class has two methods
with the same name but different number of parameters. The method for printing
area of a rectangle has two parameters which are length and breadth respectively
while the other method for printing area of square has one parameter which is side
of square.*/
import java.util.Scanner;

public class AreaSqRec 
{
	void Area(int a) 
	{
		float area = a * a;
		System.out.println("The Area of square is : " + area);
	}
	void Area(int a, int b)
	{
		float ar = a * b;
		System.out.println("The Area of Rectangle is : " + ar);
	}
	public static void main(String[] args) 
	{
		// get value from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the sqaure : ");
		int s = sc.nextInt();
		System.out.println("Enter the width and breadth of the rectangle : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//creation of object of current class
		AreaSqRec s1 = new AreaSqRec();
		
		//calling the methods of current class through its object
		s1.Area(s);
		s1.Area(a, b);
	}
}
