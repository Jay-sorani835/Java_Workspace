package module.j2;

import java.util.Scanner;

public class AreaSqRec {
	void Area(int a) {
		float area = a * a;
		System.out.println("The Area of square is : " + area);
	}
	void Area(int a, int b) {
		float ar = a * b;
		System.out.println("The Area of Rectangle is : " + ar);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width and breadth of the rectangle : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter the side of the sqaure : ");
		int s = sc.nextInt();
		AreaSqRec s1 = new AreaSqRec();
		s1.Area(s);
		s1.Area(a, b);
	}
}
