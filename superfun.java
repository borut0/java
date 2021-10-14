class A
{
	int z;
}
class B extends A
{
	
	int z;
	void xy()
	{
		
		int z;
		z=9;
		this.z=6;
		super.z=5;
		
		System.out.println(" " + z + ", " + this.z+ ", " + super.z);	
	}
}
public class superfun
{
	public static void main(String [] args)
	{
		B obj =new B();
		obj.xy();
	}
}