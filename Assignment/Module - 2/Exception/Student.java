package apr11;

import java.util.Scanner;

/*W.A.J.P to create a class Student with attributes roll no, name, age and course.
Initialize values through parameterized constructor. If age of student is not in
between 15 and 21 then generate user defined exception
"AgeNotWithinRangeException". If name contains numbers or special symbols
raise exception "NameNotValidException". Define the two exception classes.*/
class AgeNotWithinRangeException extends Exception
{
	int age;
	public AgeNotWithinRangeException(int age) 
	{
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
class NameNotValidException extends Exception
{
	String name;
	public NameNotValidException(String name) 
	{
		this.name = name;
	}
	String getName() {
		return name;
	}
}
public class Student  
{
	int RollNo, age;
	String name, course;
	public Student(int RollNo, String name, int age, String course) throws NameNotValidException 
	{
		this.RollNo = RollNo;
		this.age = age;
		this.name = name;
		this.course = course;
		try {
			if(age >= 15 && age <= 21)
			{
				throw new AgeNotWithinRangeException(age);
			}
			if(!name.contains("1,2,3,4,5,6,7,8,9,0,$,%,&,#"))
			{
				throw new NameNotValidException(name);
			}
		}
		catch(AgeNotWithinRangeException e) 
		{
			System.out.println("Age is not valid because age is " + e.getAge());
		}
		catch (NameNotValidException e) 
		{
			System.out.println("Name is not valid because name is " + e.getName() + " not contains only Character.");
		}
	}
	

	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the RollNo, Name, age, and course :");
		int RollNo = sc.nextInt();
		String name = sc.next();
		int age = sc.nextInt();
		String course = sc.next();
		new Student(RollNo, name, age, course);
	}
}
