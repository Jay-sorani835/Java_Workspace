package apr20;
// Write a Java program to get a collection view of the values contained in this map.
import java.util.HashMap;
import java.util.Scanner;

public class CollectionView 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap<>();
		
		// insert the data using Scanner
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the key and data : ");
		for(int i = 0;i < 5;i++)
		{
			System.out.println("Enter the data of " + (i+1));
			map.put(sc.next(), sc.next());
		}
		
		// view the map
		
		System.out.println("Collection view is : " + map.values());
	}
}
