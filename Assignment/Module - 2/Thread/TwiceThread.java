package apr17;

/* W.A.J.P to start the same Thread twice by calling start () method twice. Test
ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();*/

class ThreadTwice extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is Thread");
	}
//	public void start()
//	{
//		System.out.println("This is Thread calling by custom start method");
//	}
}
public class TwiceThread 
{
	public static void main(String[] args) 
	{
		ThreadTwice t1 = new ThreadTwice();
		try {
			t1.start();
			t1.start();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}