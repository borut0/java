//passing objects to methods

public class demoobj
{
	int height,width;
	demoobj(int h, int w)
	{
		height=h;
		width=w;
	}
	void area(demoobj o)
	{
		int result=(height + o.height)*(width+o.width);
		System.out.println("The area is "+result);
	}
}
class demo
{
	public static void main(String [] args)
	{
		demoobj obj = new demoobj(6,5);
		demoobj obj1 = new demoobj(10,23);
		obj.area(obj1);
	}
}
	