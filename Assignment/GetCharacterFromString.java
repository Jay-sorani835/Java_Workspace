package mar14;

import java.util.Scanner;

public class GetCharacterFromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.next();
		System.out.println("String is " + str);
		System.out.println("Enter the index number :");
		int i = sc.nextInt();
		System.out.println("The character at index " + i + " is " + str.charAt(i-1));
//		System.out.println("Enter the index number : ");
//		String i = sc.next();
//			int j = Integer.parseInt(i);
//			System.out.println("The character at index " + j + " is " + str.charAt(j));
		
	}
}
