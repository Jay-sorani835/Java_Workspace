package task;

import java.util.*;

public class MissNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();

		System.out.println("The number between " + a + " and " + b);
		for(int i = a+1;i < b;i++) {
			System.out.print(i + " ");
		}
	}
}
