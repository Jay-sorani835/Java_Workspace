package apr11;
//W.A.J. P to create one thread by implementing Runnable interface in Class.

class ThreadRun implements Runnable
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is thread using Runnable Interface.");
	}
}
public class ThreadUsingRunnable 
{
	public static void main(String[] args) 
	{
		ThreadRun t1 = new ThreadRun();
		t1.run();
	}
}
