class base
{
	void display()
	{
	System.out.println("base method called");
	}
}
class derived extends base
{
	 void display()
	{
		System.out.println("Derived method  called");
	}
}
public class dmd
{
	public static void main(String [] args)
	{	
		base obj= new derived();
		obj.display();
	}
}