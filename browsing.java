interface crome
{
	void crome();	
}
interface firefox
{
	void firefox();
}
class browser implements crome,firefox
{
	public void crome()
	{
		System.out.println("hello crome");
	}
	public void firefox()
	{
		System.out.println("hello firefox");
	}
}
public class browsing
{
	public static void main(String [] args)
	{
		
		browser obj = new browser();
		obj.crome();
		obj.firefox();		
	}
}
  