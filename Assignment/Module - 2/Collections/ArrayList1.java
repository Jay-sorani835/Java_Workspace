package apr13;

import java.util.ArrayList;

/*Write a Java program to create a new array list, add some colors (string) and print out
the collection.*/

public class ArrayList1 
{
	public static void main(String[] args) 
	{
//		String[] color = {"Red", "White", "Black", "Gray", "Pink", "Green", "Brown", "Cyan", "Silver", "Blue","Yellow"};
		ArrayList<String> arr = new ArrayList<String>();
		
		//inserting the value
		arr.add("Red");
		arr.add("White");
		arr.add("Black");
		arr.add("Gray");
		arr.add("Pink");
		arr.add("Green");
		arr.add("Brown");
		arr.add("Cyan");
		arr.add("silver");
		arr.add("Yellow");
		arr.add("Blue");
		
		
		System.out.println("Array of color is : " + arr);
	}
}
