package apr9;
//Demonstrate Try and catch block
public class DemoTryCatch 
{
	public static void main(String[] args) 
	{
		try //Try block 
		{
			int a = 10;
			int b = 0;
			System.out.println("This is try block to throw Exception to the catch block.");
			System.out.println(a/b);
		} 
		catch (Exception e) //Catch block
		{
			// TODO: handle exception
			System.out.println("This is catch block to resolve the Exception.");
			System.out.println("The Exception is " + e);
		}
	}
}
