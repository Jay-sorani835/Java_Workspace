package com.a26mar;
/*Create a class with a method that prints "This is a parent class" and its subclass with
another method that prints "This is child class". Now, create an object for each of
the class and call 1 - method of parent class by object of parent class 2 - method of
child class by object of child class 3 - method of parent class by object of child class*/
class Parent
{
	void parent() 
	{
		System.out.println("This is a Parent Class.");
	}
}
class child extends Parent
{
	void child() 
	{
		System.out.println("This is a child class.");
	}
}
public class Inherit 
{
	public static void main(String[] args) 
	{
		//object creation of classes
		Parent p = new Parent();
		child c = new child();
		
		//calling the methods of class
		p.parent();
		c.child();
		
		System.out.print("Using child class object : ");
		c.parent();
	}
}
