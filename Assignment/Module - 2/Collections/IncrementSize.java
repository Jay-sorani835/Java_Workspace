package apr18;
//Write a Java program to increase the size of an array list.
import java.util.ArrayList;

public class IncrementSize 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList<>();
		
		//add the data 
		list.add("JAVA");
		list.add("PHP");
		list.add("PYTHON");
		list.add("FLUTTER");
		list.add(".NET");
		
		//current size
		
		System.out.println("The size before insert another data : " + list.size());
		
		// add another data 
		list.add("Andorid");
		list.add("Kotiln");
		list.add("UI/UX Design");
		
		// size after add another data
		
		System.out.println("The size after the add another data : " + list.size());
	}
}
