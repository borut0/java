class A
{ 
	int a=0;
	void fun(int i)
	{
		this.a=i;
	}
}
class B extends A
{
	int b;
	void fun(int i)	
	{
		int c;
		b=20;
		super.fun(i+5);
		System.out.println("value of a"+a);
		System.out.println("value of b"+b);
		c=a*b;
		System.out.println("value of c="+c);
	}
}
class override
{
	public static void main(String [] args)
	{
		B o = new B();	
		o.fun(5);
	}
}