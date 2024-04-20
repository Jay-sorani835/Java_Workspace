package apr9;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

/*We have to calculate the percentage of marks obtained in three subjects (each out of
100) by student A and in four subjects (each out of 100) by student B. Create an
abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two
other classes 'A' and 'B' each having a method with the same name which returns the
percentage of the students. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its parameters for student
B. Create an object for each of the two classes and print the percentage of marks for
both the students.*/
abstract class Marks 
{
	abstract double getPercentage() ;
}
class A1 extends Marks
{
	int a,b,c;
	@Override
	double  getPercentage()
	{
		double per = ((a+b+c) * 100) / 300;
		return per;
	}
	A1(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		double res = getPercentage();
		System.out.println("A got " + res + "%");
	}
	
}
class B1 extends Marks
{
	int a,b,c,d;
	@Override
	double getPercentage() 
	{
		double per = ((a+b+c+d) * 100) / 400;
		return per;
	}
	B1(int a, int b, int c,int d)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		double res = getPercentage();
		System.out.println("A got " + res + "%");
	}
}
public class Percentage
{
	public static void main(String[] args) 
	{
		//taking value from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enterr the marks for student 1 : sub1, sub2, sub3 :  ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//object create
		A1 ac = new A1(a, b, c);
		System.out.println("Enterr the marks for student 2 : sub1, sub2, sub3, sub4 :  ");
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int c1 = sc.nextInt();
		int d1 = sc.nextInt();
		B1 b2 = new B1(a1, b1, c1, d1);
	}
}