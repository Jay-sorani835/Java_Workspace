package apr16;
import java.util.*;
//Write a Java program to sort a given array list.

public class SortList 
{
	public static void main(String[] args) 
	{

		ArrayList<Float> list = new ArrayList<Float>();
		//Insert the value
		list.add(3.4f);
		list.add(3.14f);
		list.add(3.41f);
		list.add(3.141f);
		list.add(3.14141f);
		
		//sort the list
		list.sort(null);
		System.out.println(list);
	}

}
