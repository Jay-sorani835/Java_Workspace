package module.j2;

import java.util.Scanner;

public class SumNdAvg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter five element : ");
		for (int i = 0; i < 5; i++) {
			sum = sum + sc.nextInt();
		}
		float avg = sum / 5;
		System.out.println("The total sum and avg is " + sum + " and "+ avg);
	}
}
