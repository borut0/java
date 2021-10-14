public class constructor1
{
	double Breath;
	double luck;
	String name;
	
	public constructor1()
	{
		Breath = 1000;
		luck =0.5;
	}
public constructor1(String name)
	{
		this();
		this.name=name;
	}
public static void main(String [] args)
	{
		constructor1 obj = new constructor1();
		System.out.println("breath =" + obj.Breath);
		System.out.println("luck =" + obj.luck );
		System.out.println("name =" + obj.name );
	}
}
	