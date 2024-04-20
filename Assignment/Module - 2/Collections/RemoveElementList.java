package apr16;
import java.util.*;
// Write a Java program to remove the third element from an array list
public class RemoveElementList 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		//insert the value
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		System.out.println(list);
		
		//remove 
		list.remove(3);
		
		System.out.println("After removing the element list is : " + list);
	}
}
