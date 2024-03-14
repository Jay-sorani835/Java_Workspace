package mar14;

import java.util.Scanner;

//Write a Java program that accepts an integer (n) and computes the value of
//n+nn+nnn. Input number: 5
//5 + 55 + 555
public class Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nummber : ");
		int a = sc.nextInt();
		for(int i = 0;i < a;i++) {
			System.out.print(a);
			for(int j = 0;j < a-i-4;j++) {
				System.out.print(" + ");
			}
//			for(int j = a-2-i; j > 0;j--) {
//				System.out.print("+");
//			}
		}
	}
}
