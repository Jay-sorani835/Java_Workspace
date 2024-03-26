package com.a26mar;

class Parent{
	void parent() {
		System.out.println("This is a Parent Class.");
	}
}
class child extends Parent{
	void child() {
		System.out.println("This is a child class.");
	}
}
public class Inherit {
	public static void main(String[] args) {
		Parent p = new Parent();
		child c = new child();
		p.parent();
		c.child();
		System.out.print("Using child class object : ");
		c.parent();
	}
}
