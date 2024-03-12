import java.util.Scanner;

public class Div3_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("");
		System.out.println("The numbers which are divisible by 3 :");
		for(int i = 1; i <= 100;i++) {
			if((i%3) == 0) {
				System.out.print(i+ " ");
			}
		}
		System.out.println();
		System.out.println("The numbers which are divisible by 5 :");
		for(int i = 1; i <= 100; i++) {
			if((i % 5) == 0) {
				System.out.print(i + " ");
			}
		}System.out.println();
			System.out.println("The numbers which are divisible by 3 and 5 :");
		for(int i = 1; i <= 100; i++) {
			if((i % 3) == 0 && (i % 5) == 0) {
				System.out.print(i+" ");
			}
		}
	}
}
