package apr18;

import java.util.ArrayList;

/*Write a Java program to replace the second element of an Array List with the
specified element.
*/
public class AddElementAtSpecifiedIndex 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList<>();
		
		//add the data 
		
		list.add("JAVA");
		list.add("PHP");
		list.add("PYTHON");
		list.add("FLUTTER");
		list.add(".NET");
		
		//before replacement
		System.out.println("Before replace the second element : " + list);
		
		//replace 
		list.set(1, "C++");
		
		//after replacement 
		System.out.println("After replacement : " + list);
	}
}
