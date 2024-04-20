package com.a26mar;
import java.util.*;
/*Write a program which will ask the user to enter his/her
marks (out of 100). Define a method that will display grades according to the marks
entered as below:
Marks Grade
1-100 A
1-90 B
1-80 B
1-70 C
1-60 D
41-50 DD
40 Fail*/
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
		GradeCal g = new GradeCal(marks); //calling constructor of GradeCal class.
	}
}
