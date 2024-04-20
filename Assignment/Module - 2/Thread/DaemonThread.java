package apr13;
/*W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set
Daemon () method of Thread class and check whether the thread is set daemon or
not by using is Daemon () method.
TestDaemonThread2 t1=new TestDaemonThread2();
TestDaemonThread2 t2=new TestDaemonThread2(); t1.start();
t1.setDaemon(true);//will throw exception here t2.start();
*/
class daemon extends Thread
{
	@Override
		public void run() {
			// TODO Auto-generated method stub
			if(Thread.currentThread().isDaemon())
			{
				System.out.println("This is Daemon Thread.");
			}
			else {
				System.out.println("This is not a Daemon Thread. ");
			}
		}
}
public class DaemonThread 
{
	public static void main(String[] args) 
	{
		daemon t1 = new daemon();
		daemon t2 = new daemon();
		
		//set the Daemon Thread
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		
	}
}
