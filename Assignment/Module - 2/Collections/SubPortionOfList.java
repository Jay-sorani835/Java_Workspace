package apr18;
//Write a Java program to extract a portion of an array list.
import java.util.ArrayList;
import java.util.Scanner;

public class SubPortionOfList 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		//insert the data through user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the list : ");
		int n = sc.nextInt();
		System.out.println("Enter the data : ");
		for(int i = 0;i < n;i++)
		{
			list.add(sc.next());
		}
		
		// insert sub portion index
		
		System.out.println("Enter the sub portion first index and last index : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// list 
		System.out.println(list);
		// sub portion
		
		System.out.println(list.subList(a, b));
	}
}
