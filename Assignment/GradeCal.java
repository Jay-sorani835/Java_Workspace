package com.a26mar;
import java.util.*;

public class GradeCal {
	GradeCal(int m){
		if(m >= 90) {
			System.out.println("A grade");
		}
		else if(m >= 80) {
			System.out.println("B Grade");
		}
		else if(m >= 70) {
			System.out.println("C Grade");
		}
		else if (m >= 60) {
			System.out.println("D Grade");
		}
		else if(m >= 41 && m <= 50) {
			System.out.println("DD Grade");
		}
		else {
			System.out.println("You are Fail.");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks out of the 100 : ");
		int marks = sc.nextInt();
		GradeCal g = new GradeCal(marks);
	}
}
