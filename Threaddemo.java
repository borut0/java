public class Threaddemo
{
	public static void main(String [] args)
	{
		Thread t1 = new Thread(new A());
		Thread t2 = new Thread(new B());
		// Thread t3 = new Thread(new C());
		t1.start();
		t2.start();
		// t3.start();
	}
}
class A implements Runnable
{
	public void run()
	{
		int a=4,b=9;
		System.out.println("add is "+(a+b));
		System.out.println("suv is "+(a-b));
	}
}
class B implements Runnable
{
	public void run()
	{
		int a=4,b=9;
		System.out.println("div is "+(a/b));
		System.out.println("mul is "+(a*b));
	}
}
/* class C implemets Runnable
{
	public void run()
	{
		int a=4,b=9;
		System.out.println("modu is "+(a%b));
		System.out.println("nothing left");
	}
} */	