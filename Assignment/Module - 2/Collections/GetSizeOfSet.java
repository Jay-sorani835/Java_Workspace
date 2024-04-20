package apr18;
//Write a Java program to get the number of elements in a hash set.

import java.util.HashSet;

public class GetSizeOfSet 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet<>();
		
		// insert the data 
		
		set.add("JAVA");
		set.add("PYTHON");
		set.add("REACT");
		set.add("PHP");
		set.add("FLUTTER");
		
		
		//size of the set
		
		System.out.println("Number of elements in the set is : " + set.size());
	}
}
