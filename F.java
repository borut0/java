class E
{
	int a;
	public E()
	{
	System.out.println("no. multiply by 2 is "+ a*2);
	}
}
class H extends E
{
	public H()
	{
	super();
	System.out.println("no. multiply by 3 is "+ a*3);
	}
}
public class F
{
	public static void main(String [] args)
	{
		H obj = new H();
	}
}
		