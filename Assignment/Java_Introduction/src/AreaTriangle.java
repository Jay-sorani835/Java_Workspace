//find area of the triangle
import java.util.Scanner;
public class AreaTriangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//get data from 
		System.out.println("Enter first side : ");
		int first = sc.nextInt();
		System.out.println("Enter second side : ");
		int second = sc.nextInt();
		System.out.println("Enter third side : ");
		int third = sc.nextInt();
		
		//area calculate
		int s = (first + second + third) / 2;
		double area = Math.sqrt(s*(s-first)*(s-second)*(s-third));
		System.out.println("Area of the triagle is : " + area);
	}
}
