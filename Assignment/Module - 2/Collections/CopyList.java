package apr17;
//Write a Java program to copy one array list into another.
import java.util.ArrayList;

public class CopyList 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList<>();
		
		//add element 
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		//list 
		System.out.println(list);
		
		//copy
		
		ArrayList copy = list;

		System.out.println("After copy one list to another list : ");
		System.out.println(copy);
	}
}
