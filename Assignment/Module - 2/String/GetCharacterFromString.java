package mar14;
/*W.A.J.P to get the character at the given index within the String. Original String =
Tops Technologies! The character at position 0 is T, The character at position 10 is
o
*/
import java.util.Scanner;

public class GetCharacterFromString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		System.out.println("String is " + str);
		System.out.println("Enter the first index and second index number between "+ str.length() + " :");
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.println("The character at index " + i + " is " + str.charAt(i) + " and character at index "+ j + " is "+ str.charAt(j));		
	}
}
