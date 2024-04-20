package apr2;
/*Print the sum, difference and product of two complex numbers by creating a class
named 'Complex' with separate methods for each operation whose real and
imaginary parts are entered by user.
*/
import java.util.Scanner;

public class Complex 
{
	int r,i,r1,i1;
	void get() 
	{
		//get the value from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the real part of the number 1:");
		r = sc.nextInt();
		System.out.println("Enter the imaginary part of the number 1");
		i = sc.nextInt();
		System.out.println("Enter the real part of the number 2:");
		r1 = sc.nextInt();
		System.out.println("Enter the imaginary part of the number 2");
		i1 = sc.nextInt();
	}
	void sum() // addition method
	{
		int sumr,suml;
		sumr = r + r1;
		suml = i + i1;
		System.out.println("The Sum is " + sumr + " + " + (suml) +"i");
	}
	void sub() //subtraction method
	{
		int subr,subl;
		subr = r - r1;
		subl = i - i1;
		System.out.println("The Subtraction is " + subr + " + " + subl + "i");
	}
	void mul() // multiplication method
	{
		int mulr,muli;
		mulr = r*r1 - i*i1;
		muli = r*r1 + i*i1;
		System.out.println("The Multiplication is " + mulr + " + " + muli + "i");	
	}
	public static void main(String[] args) 
	{
		//object creation
		Complex c = new Complex();
		c.get();
		c.sum();
		c.sub();
		c.mul();
	}
}
