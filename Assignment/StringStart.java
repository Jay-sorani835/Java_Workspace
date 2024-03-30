package mar30;

import java.util.Scanner;

public class StringStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = "Java Exercise";
		String startstr = sc.next();
		if(str.startsWith(startstr)) {
			System.out.println("Yes! String start with " + startstr);
		}
		else {
			System.out.println("No string is not start with " + startstr);
		}
	}
}
