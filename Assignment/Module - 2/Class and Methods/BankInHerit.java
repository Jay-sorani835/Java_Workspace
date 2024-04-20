package apr9;
/*• Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
are subclasses of class 'Bank', each having a method named 'getBalance'. Call this
method by creating an object of each of the three classes.*/
import java.util.Scanner;

abstract class Bank
{
	abstract void getBalance();
	Scanner sc = new Scanner(System.in); 
}
class A extends Bank
{
	int a;
	@Override
	void getBalance() 
	{
		System.out.println("Enter the balance of the class A :");
		a = sc.nextInt();
	}
	void print() 
	{
		System.out.println("The balance of A is " + a);
	}
}
class B extends Bank
{
	int b;
	@Override
	void getBalance() 
	{
		System.out.println("Enter the balance of the class B :");
		b = sc.nextInt();
	}
	void print() 
	{
		System.out.println("The balance of B is " + b);
	}
}
class C extends Bank
{
	int c;
	@Override
	void getBalance() 
	{
		System.out.println("Enter the balance of the class B :");
		c = sc.nextInt();
	}
	void print() 
	{
		System.out.println("The balance of C is " + c);
	}
}
public class BankInHerit 
{
	public static void main(String[] args) 
	{
		//creation of the object 
		A a = new A();
		B b = new B();
		C c = new C();
		
		// calling the method of class
		a.getBalance();
		b.getBalance();
		c.getBalance();
		a.print();
		b.print();
		c.print();
	}
}
