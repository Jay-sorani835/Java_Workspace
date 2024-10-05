//find area of the circle

import java.util.Scanner;

public class AreaCircle 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//get data from user
		System.out.println("Enter the radius : ");
		int a = sc.nextInt();
		System.out.println("Area of the circle is : "  + (Math.PI*a*a));
	}
}
