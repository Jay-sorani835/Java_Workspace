package apr16;
import java.util.ArrayList;
import java.util.Collection;

//Write a Java program to insert an element into the array list at the first position.
public class InsertList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		//Insert operation in list
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(3);
		
		//insert at first position
		
		list.add(0, 0);
		System.out.println(list);
		
	}
}
