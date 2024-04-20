package apr17;
//Write a Java program to search an element in an array list.

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElementList 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList list = new ArrayList();
		
		//add element
		list.add("JAVA");
		list.add("PHP");
		list.add("PYTHON");
		list.add("FLUTTER");
		list.add(".NET");
		
		//print list 
		System.out.println(list);
		
		//find index of which element 
		
		System.out.println("Enter the data for finding index : ");
		String get = sc.next();
		//Find element at which index
		System.out.println("The Index "  + get + " is " + list.indexOf(get));
		
	}
}
