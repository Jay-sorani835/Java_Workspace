package apr9;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
two methods to print the area and perimeter of the rectangle respectively. Its
constructor having parameters for length and breadth is used to initialize the length
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its
constructor having a parameter for its side (suppose s) calling the constructor of its
parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.*/

class Rectangle
{
	double length,breadth;
	
	//Constructor to initialize breadth and length
	public Rectangle(double length, double breadth) 
	{
		// TODO Auto-generated constructor stub
		this.length = length;
		this.breadth = breadth;
	}
	void area() 
	{
		System.out.println("The area of the rectangle is : " + (length*breadth));
	}
	void perimeter() 
	{
		System.out.println("The Perimeter of the rectangle is : " + (breadth + length));
	}
	
}
public class Square extends Rectangle
{

	public Square(double s) 
	{
		// TODO Auto-generated constructor stub
		super(s,s);
		area(s);
		perimeter(s);
	}
	void area(double a) 
	{
		System.out.println("The Area of the Square is : " + (a*a));
	}
	void perimeter(double a ) 
	{
		System.out.println("The perimeter of the square is : "+ (4*a));
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side : ");
		double c = sc.nextDouble();
//		double b = sc.nextDouble();
//		double l = sc.nextDouble();
		Square s = new Square(c);
		s.area();
		s.perimeter();
	}
	
}

