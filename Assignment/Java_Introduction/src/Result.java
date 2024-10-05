//calculate sum of 5 subject marks and find the percentage
import java.util.Scanner;
public class Result 
{
	public static void main(String[] args) 
	{
		//get data
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of subject 1 out of 100 : ");
		int m1 = sc.nextInt();
		System.out.println("Enter marks of subject 2 out of 100 : ");
		int m2 = sc.nextInt();
		System.out.println("Enter marks of subject 3 out of 100 : ");
		int m3 = sc.nextInt();
		System.out.println("Enter marks of subject 4 out of 100 : ");
		int m4 = sc.nextInt();
		System.out.println("Enter marks of subject 5 out of 100 : ");
		int m5 = sc.nextInt();
		
		int total = (m1 + m2 + m3 + m4 + m5);
		//percentage
		System.out.println("Percentage is : " + ((total / 500) * 100) + "%");
		
	}
}
