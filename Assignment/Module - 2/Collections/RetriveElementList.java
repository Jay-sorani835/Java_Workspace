package apr16;
import java.util.*;
///Write a Java program to retrieve an element (at a specified index) from a given array list.
public class RetriveElementList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		
		//Insert into list 
		list.add("IBM");
		list.add("Google");
		list.add("Microsoft");
		list.add("Facebook");
		list.add("Amazon");
		list.add("Samsung");
		list.add("PayPal");
		list.add("TCS");
		list.add("Wipro");
		
		//Retrieve at given index
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(6));
	}
}
