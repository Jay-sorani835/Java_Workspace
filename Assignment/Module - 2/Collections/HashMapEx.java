package apr18;
/*Write a Java program to associate the specified value with the specified key in a
Hash Map.
*/
import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap<>();
		
		// insert the data 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the data : ");
		for(int i = 1;i <= 5;i++)
		{
			System.out.println("Enter the key and value of that key : ");
			map.put(sc.nextInt(), sc.next());
		}
		System.out.println(map);
	}
}
