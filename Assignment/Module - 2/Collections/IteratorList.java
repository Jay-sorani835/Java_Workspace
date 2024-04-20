package apr17;
//Write a Java program to iterate through all elements in an array list.
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorList 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList<>();
		
		list.add("JAVA");
		list.add("PHP");
		list.add("PYTHON");
		list.add("FLUTTER");
		list.add(".NET");
		
		Iterator i = list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
