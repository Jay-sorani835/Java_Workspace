package apr16;

import java.util.Scanner;

/*W.A.J.P to create a class Student with attributes roll no, name, age and course.
Initialize values through parameterized constructor. If age of student is not in
between 15 and 21 then generate user defined exception
"AgeNotWithinRangeException". If name contains numbers or special symbols
raise exception "NameNotValidException". Define the two exception classes.*/
class AgeNotValidWithinRangeException extends Exception //Age validation Exception
{
	public AgeNotValidWithinRangeException() {
		System.out.println("Age is not in Range.");
	}
}
class NameNotValidException extends Exception //Name validation Exception
{
	public NameNotValidException() {
		System.out.println("Name is not valid.");
	}
}
public class CustomExceptionAge 
{
	public CustomExceptionAge() throws AgeNotValidWithinRangeException, NameNotValidException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name = sc.next();
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		
		if(age >= 15 && age <= 21)
		{
			throw new AgeNotValidWithinRangeException(); //throw a new Exception
		}
		for(int i = 0;i < name.length();i++)
		{
			if(!(name.charAt(i) >= 65 && name.charAt(i) <= 90 || name.charAt(i) >= 97 && name.charAt(i) <= 122))
			{
				throw new NameNotValidException();	// throw a new Exception
			}
		}
	}
	public static void main(String[] args) throws AgeNotValidWithinRangeException, NameNotValidException
	{
		new CustomExceptionAge();
	}
}
