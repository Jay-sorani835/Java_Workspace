package module.j2;
/*Write a Java program to print the ASCII value of a given character.*/
import java.util.Scanner;

public class AsciiValue 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the charcter : ");
		char c = sc.next().charAt(0);
		int i = c;
		System.out.println("ASCII value of " + c + " is " + i);
	}
}
