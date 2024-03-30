package mar14;
import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = "jay 123@gmail";
		char[] ch = str.toCharArray();
		int l = 0,d = 0,s = 0, o = 0;
		
		for(int i = 0;i < str.length();i++) {
			if(Character.isLetter(ch[i])) {
				l++;
			}
			else if (Character.isDigit(ch[i])) {
				d++;
			}
			else if (Character.isSpaceChar(ch[i])) {
				s++;
			}
			else {
				o++;
			}
		}
		System.out.println(str + " in this no. of letters are " + l + ", no. of digits are " + d + ", no. of spaces are " + s + " and other characters are " + o);
	}
}
