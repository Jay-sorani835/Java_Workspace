package apr16;
//Write a Java program to update specific array element by given element.
import java.util.ArrayList;
import java.util.Scanner;

public class UpdateElementList 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		//insert the value
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		//Before update
		System.out.println(list);
		
		//update particular value 
		System.out.println("Enter old value and new value : ");
		int old = sc.nextInt();
		int n = sc.nextInt();
		
		int index = list.indexOf(old);
		
		//Update the value 
		
		list.set(index, n);
		
		//After update
		System.out.println(list);
		
		
		
	}

}
