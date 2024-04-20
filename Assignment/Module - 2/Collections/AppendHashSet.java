package apr17;

import java.util.HashSet;

public class AppendHashSet 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet<>();
		HashSet set1 = new HashSet<>();
		
		//add the set 
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		
		//add to set1
		set1.add(6);
		set1.add(7);
		set1.add(8);
		set1.add(9);
		set1.add(10);
		
		//set before append
		System.out.println("Before append another set "+set);
		
		//append 
		set.addAll(set1);
		
		//set after append
		System.out.println("After append another set"+set);
	}
}
