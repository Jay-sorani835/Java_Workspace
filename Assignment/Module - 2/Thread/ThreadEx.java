package apr9;
//W.A.J. P to create one thread by extending Thread class in another Class.
class Ex extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is the Thread Example.");
	}
}
public class ThreadEx 
{
	public static void main(String[] args) 
	{
		Ex e = new Ex();
		e.start();
	}
}
