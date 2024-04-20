package apr9;
/*Create a class named 'Shape' with a method to print "This is this is shape". Then
create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both
having a method to print "This is rectangular shape" and "This is circular shape"
respectively. Create a subclass 'Square' of 'Rectangle' having a method to print
"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the
object of 'Square' class.
*/
class Shape
{
	Shape()
	{
		System.out.println("This is Shape.");
	}
}
class Rectangle1 extends Shape
{
	public Rectangle1() 
	{
		System.out.println("This is Rectangle Shape.");
	}
}
class Circle extends Shape
{
	Circle()
	{
		System.out.println("This is Circle Shape.");
	}
}
class Square1 extends Rectangle1
{
	Square1()
	{
		System.out.println("Square is a rectangle.");
	}
}
public class HirarechicalEX
{
	public static void main(String[] args) 
	{
		Square1 s = new Square1();
	}

}
