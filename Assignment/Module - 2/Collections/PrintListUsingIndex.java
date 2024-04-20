package apr18;
/*Write a Java program to print all the elements of an Array List using the position of
the elements.
*/
import java.util.ArrayList;

public class PrintListUsingIndex 
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList<>();
		//add data
		
		list.add("JAVA");
		list.add("PHP");
		list.add("PYTHON");
		list.add("FLUTTER");
		list.add(".NET");
		
		//print the data using 
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
	}
}
