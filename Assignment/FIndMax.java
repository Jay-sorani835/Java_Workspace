package com.a73;
import java.util.Scanner;
public class FIndMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int a = n;
		int max = 0, rem = 0;
		while(n != 0){
	        rem = n % 10;
	        if(rem > max)
	            max = rem;
	        n = n / 10;
	    }
		System.out.println("Max number from " + a + " is " + max);
	}
}
