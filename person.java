class who
{
	int hight;
	int wight;
	String gender;
	
	public void man(String g,int h,int w)
	{
		
		hight=h;
		wight=w;
		gender=g;
	
		System.out.println("gender is "+ gender);
		System.out.println("hight is " + hight + "\nwight is" + wight);
	}
}

public class person extends who
{
	public void detail(String name,int age)
	{
		System.out.println("person name is "+ name + "and age is "+ age);
	}

	public static void main(String args[])
	{
	
		person pn = new person();
		pn.detail("moti",44);
		pn.man("male",4,100);
	}
}

 
		