package apr20;
//• Write a Java program to convert a hash set to an array.

import java.util.HashSet;
import java.util.Scanner;

public class ConvertSetToArray 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet<>();
		
		// insert the data into set
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the data : ");
		for(int i = 0;i < 5;i++)
		{
			System.out.println("Enter the data for " + (i+1));
			set.add(sc.next());
		}
		//Original set
		System.out.println("Original set is : " + set);
		
		//array
		String[] arr = new String[set.size()];
		
		set.toArray(arr);
		
		//print the array
		System.out.println("Array elements are : ");
		
		for(String element : arr)
		{
			System.out.print(element + " ");
		}
	}
}
