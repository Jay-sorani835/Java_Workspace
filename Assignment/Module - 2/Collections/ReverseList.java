package apr17;
//Write a Java program to reverse elements in an array list.
import java.util.ArrayList;
import java.util.Collections;

public class ReverseList 
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//Before reverse 
		System.out.println("Before Reverse the list is " + list );
		
		//reverse
		Collections.reverse(list);
		System.out.println("After Reverse the list is "  +list);
	}
}
