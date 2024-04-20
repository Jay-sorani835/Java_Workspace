package com.a26mar;
/*Create a class named 'Print Number' to print various numbers of different data types
by creating different methods with the same name 'printn' having a parameter for
each data type.*/
public class PrintNumber 
{
	int printn(int a)
	{
		System.out.println("The number in integer : " + a);
		return 0;
	}
	float printn(float a) 
	{
		System.out.println("The number in float : " + a);
		return 0;
	}
	double printn(double a) 
	{
		System.out.println("The number in double : " + a);
		return 0;
	}
	public static void main(String[] args) 
	{
		PrintNumber pn = new PrintNumber();
		pn.printn(12);
		pn.printn(12.12f);
		pn.printn(12.123);
	}
}
