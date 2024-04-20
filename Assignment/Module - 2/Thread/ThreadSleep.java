package apr9;
/*W.A.J.P to create 2 threads and execute that threads by providing sleep time as
2000ms and check the execution.
*/
class First extends Thread
{
	public void run() 
	{
		System.out.println("This is first Thread.");
	};
}
class Second extends Thread
{
	public void run() 
	{
		System.out.println("This is second Thread.");
	};
}
public class ThreadSleep 
{
	public static void main(String[] args) 
	{
		First a = new First();
		Second b = new Second();
		
		a.start();
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.start();
	}
}
