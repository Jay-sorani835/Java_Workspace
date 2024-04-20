package apr18;
/*Write a Java program to compare two sets and retain elements which are same on
both sets.
*/
import java.util.HashSet;
import java.util.Iterator;

public class RetainSetElement 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet<>();
		
		// insert the data into set
		
		set.add("JAVA");
		set.add("PYTHON");
		set.add("PHP");
		set.add("FLUTTER");
		
		// second set
		
		HashSet set2 = new HashSet<>();
		
		// insert the data into set2
		
		set2.add("Andorid");
		set2.add("REACT");
		set2.add("JAVA");
		set2.add("Angular");
		
		// retain the set element
		
		set.retainAll(set2);
		Iterator i = set.iterator();//initialization
		
		while(i.hasNext())//condition
		{
			System.out.println( "Elements which are common in both set is : " + i.next());
		}
	}
}
