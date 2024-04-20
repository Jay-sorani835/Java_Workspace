package mar30;
/*W.A.J.P to check whether a given string ends with the contents of another string.
"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True
*/
import java.util.Scanner;

public class StringEnd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = "Java Exercise";
		System.out.println("Enter the String : ");
		String endstr = sc.nextLine();
		if(str.endsWith(endstr)) {
			System.out.println("Yes! String end with se.");
		}
		else {
			System.out.println("NO String is not end with se.");
		}
	}
}
