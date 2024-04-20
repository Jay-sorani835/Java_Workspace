package mar30;
/*W.A.J.P to check whether a given string starts with the contents of another string.
Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts
with Red? False*/
import java.util.Scanner;

public class StringStart 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// get data from user
		System.out.println("Enter the first string :  ");
		String str = sc.nextLine(); //get start string
		System.out.println("Enter the second string : ");
		String startstr = sc.next(); // get original string
		
		// condition for original string i start with first string or not
		if(str.startsWith(startstr)) 
		{
			System.out.println("Yes! String start with " + startstr);
		}
		else 
		{
			System.out.println("No string is not start with " + str);
		}
	}
}
