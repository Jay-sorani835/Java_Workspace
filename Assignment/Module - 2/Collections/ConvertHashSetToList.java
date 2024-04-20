package apr18;
//• Write a Java program to convert a hash set to a List/Array List.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConvertHashSetToList 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet<>();
		
		// insert the data into set
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data : ");
		for(int i = 0;i < 5; i++){
			set.add(sc.next());
		}
		
		// print set
		System.out.println("The set is : " + set);
		
		// convert to list 
		ArrayList set_to_list = (ArrayList) set.stream().collect(Collectors.toList());
		
		// print list
		System.out.println("List is " + set_to_list);
	}
}
