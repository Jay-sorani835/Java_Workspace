package apr18;
//Write a Java program to compare two array lists.
import java.lang.reflect.Array;
import java.util.ArrayList;

public class CompareList 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList<>();
		
		//insert the data
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//second array list
		ArrayList list2 = new ArrayList<>();
		
		//insert the data 
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(1);
		list2.add(2);
		
		//print the list
		System.out.println("First list : " + list);
		System.out.println("First list : " + list2);
		
		//Compare the two list
		if(list.equals(list2) == true)
		{
			System.out.println("The Lists are equals.");
		}
		else
		{
			System.out.println("Lists are not equal.");
		}
	}
}
