class A extends Object
{
	public String toString()
	{
		return "A";
	}
}
class B extends A
{
	public String toString()
	{
		return "B";
	}
}
class C extends B
{
	public String toString()
	{
		return "C";
	}
}
public class polymor
{
	public static void main(String args[])
	{
		fun(new C());
		fun(new B());
		fun(new A());
	}
	public static void fun(Object x)
	{
		System.out.println(x.toString());
	}
}	
	