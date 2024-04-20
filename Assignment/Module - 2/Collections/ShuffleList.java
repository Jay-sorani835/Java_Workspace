package apr18;
//Write a Java program to shuffle elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleList 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		//add the data
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		//before shuffle
		System.out.println("Before Shuffle list is : " + list);
		
		//after shuffle 
		Collections.shuffle(list);
		System.out.println("After Shuffle list is : " + list);
	}

}
