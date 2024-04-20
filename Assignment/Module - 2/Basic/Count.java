/*Write a Java program to count the letters, spaces, numbers and other characters of
an input string.*/
import java.util.Scanner;

public class Count 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine(); //nextLine is for considering space
		int l = 0,d = 0,s = 0, o = 0;
		int n = str.length();
		for(int i = 0;i < n;i++) 
		{
			if((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)) 
			{
				l++;
			}
			else if (str.charAt(i) >= 48 && str.charAt(i) <= 57) 
			{
				d++;
			}
			else if (str.charAt(i) == 32) 
			{
				s++;
			}
			else 
			{
				o++;
			}
		}
		System.out.println(str + " in this no. of letters are " + l + ", no. of digits are " + d + ", no. of spaces are " + s + " and other characters are " + o);
	}
}
