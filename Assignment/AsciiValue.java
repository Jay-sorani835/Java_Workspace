package module.j2;

import java.util.Scanner;

public class AsciiValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the charcter : ");
		char c = sc.next().charAt(0);
		int i = c;
		System.out.println(i);
	}
}
