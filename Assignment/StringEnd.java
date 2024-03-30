package mar30;

import java.util.Scanner;

public class StringEnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = "Java Exercise";
		String endstr = "se";
		if(str.endsWith(endstr)) {
			System.out.println("Yes! String start with " + endstr);
		}
		else {
			System.out.println("NO String is not start with " + endstr);
		}
	}
}
