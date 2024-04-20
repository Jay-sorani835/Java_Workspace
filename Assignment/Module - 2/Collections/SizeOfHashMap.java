package apr18;
// Write a Java program to count the number of key-value (size) mappings in a map.

import java.util.HashMap;

public class SizeOfHashMap 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		
		// insert the data into map 
		
		map.put(1, "JAVA");
		map.put(2, "PYTHON");
		map.put(3, "PHP");
		map.put(4, "Flutter");
		
		// size of the map 
		
		System.out.println("The Size of the map is : " + map.size());
	}
}
