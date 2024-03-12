import java.util.Scanner;

public class NumberCount {
	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		while(n != 0) {
			int j  = n % 10;
			i++;
			n = n / 10;
		}
		System.out.println("The number contains " + i + " digits.");
	}
}
