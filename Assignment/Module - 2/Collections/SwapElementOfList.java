package apr18;
//Write a Java program of swap two elements in an array list.
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SwapElementOfList 
{
	public static void main(String[] args) 
	{
		SwapElementOfList s = new SwapElementOfList();
		ArrayList list = new ArrayList<>();
		
		//add data
		list.add("JAVA");
		list.add("PHP");
		list.add("PYTHON");
		list.add("FLUTTER");
		list.add(".NET");
		
		//before swapping 
		System.out.println("Before swapping the list is : " + list);
		
		//input swap index from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first index :");
		int a = sc.nextInt();
		System.out.println("Enter the second index : ");
		int b = sc.nextInt();
		
		//swap the element  
		Collections.swap(list, a, b);
		

		//after swap
		System.out.println("After the swapping the list is : " + list);
	}
}
