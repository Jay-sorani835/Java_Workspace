package apr18;
//Write a Java program to join two array lists.
import java.util.ArrayList;

public class JoinList 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		//add first list 
		list.add("JAVA");
		list.add("PHP");
		list.add("PYTHON");
		list.add("FLUTTER");
		list.add(".NET");
		
		//second list 
		ArrayList list2 = new ArrayList<>();
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		
		//join the list 
		System.out.println("First list : " + list);
		System.out.println("second list : " + list2);
		ArrayList join = new ArrayList();
		
		join.addAll(list);
		join.addAll(list2);
		System.out.println("Joining the list : " + join );
	}
}
