package apr18;
/* Write a Java program to check whether a map contains key-value mappings (empty)
or not*/
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class CheckMap 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		HashMap map2 = new HashMap();
		
		
		// insert the data using scanner 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the data : ");
		for(int i = 1;i <= 5;i++)
		{
			System.out.println("Enter the key and value of that key : ");
			map.put(sc.nextInt(), sc.next());
		}
		
		// check map is empty or not
		if(map.isEmpty() == true)
		{
			System.out.println("Map 1 is Empty");
		}
		else
		{
			System.out.println("Map1 has some values.");
		}
		if (map2.isEmpty() == true) 
		{
			System.out.println("Map 2 is Empty.");
		}
		else
		{
			System.out.println("Map 2 has some values.");
		}
	}
}
