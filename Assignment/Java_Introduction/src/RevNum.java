//find the reverse numbe of given number
import java.util.Scanner;

public class RevNum 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int orignal = n;
		int rev = 0, rem = 0;
		while(n != 0) {
			rem = n % 10;
		    rev = rev * 10 + rem;
		    n = n/10;
		}
		System.out.println(orignal + " is in reverse number is : " + rev);
	}
}