package apr11;

import java.util.Scanner;

/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract
class 'Shape' with three abstract methods namely 'RectangleArea' taking two
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the
area of rectangle, square and circle respectively. Create an object of class 'Area' and
call all the three methods.*/

abstract class Shape
{
	abstract void RectangleArea(double length, double breadth);
	abstract void SquareArea(double side);
	abstract void CircleArea(float radius);
}
class Area extends Shape
{

	@Override
	void RectangleArea(double length, double breadth)
	{
		System.out.println("The Area of the rectangle is : " + (length*breadth));
	}

	@Override
	void SquareArea(double side)
	{
		System.out.println("The Area of the square is : " + (side * side));
	}

	@Override
	void CircleArea(float radius) 
	{
		System.out.println("The Area of the circle is : " +(Math.PI * radius * radius));
	}	
}
public class AreaFind 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth of the Rectangle : ");
		double l,b;
		l = sc.nextDouble();
		b = sc.nextDouble();
		System.out.println("Enter the side of the square : ");
		double s = sc.nextDouble();
		System.out.println("Enter the radius of the circle : ");
		float r = sc.nextFloat();
		Area ar = new Area();
		ar.RectangleArea(l, b);
		ar.SquareArea(s);
		ar.CircleArea(r);
	}
}
