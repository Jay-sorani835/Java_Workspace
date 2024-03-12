package module.j2;

import java.util.Scanner;
public class MaxNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		System.out.println("Enter the third number : ");
		int c = sc.nextInt();
		if(a > b && a > c) {
			System.out.println(a + " is Max.");
		}
		else if(b > a && b > c) {
			System.out.println(b + " is Max.");
		}
		else {
			System.out.println(c + " is Max.");
		}
	}
}
