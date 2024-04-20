package apr2;
/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and
5 units by creating a class named 'Triangle' without any parameter in its constructor.*/
public class Triangle
{
	public Triangle()
	{
		int a = 3,b = 4,c = 5;
		double s = (a+b+c)/2;
		double Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		double perimeter = a+b+c;
		System.out.println("The Perimeter of the triangle is " + perimeter);
		System.out.println("The area of the Triangle is " + Area);
	}
	public static void main(String[] args) 
	{
		Triangle t = new Triangle(); 
	}
}
