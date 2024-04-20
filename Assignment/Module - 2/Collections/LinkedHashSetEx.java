package apr18;

//Write a Java program to iterate through all elements in a hash list.
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx 
{
	public static void main(String[] args) 
	{
		LinkedHashSet set = new LinkedHashSet();
	
		//insert the data 
		set.add("JAY");
		set.add("Ayush");
		set.add("Jigar");
		set.add("Suketu");
		set.add("Mihir");
		
		//get data through iterator
		
		Iterator t = set.iterator();
		
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
	}
}
