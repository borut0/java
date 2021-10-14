public class random
{
	public static void main(String [] args)
	{
		
		int a = (int)(Math.random()*2);
		System.out.println(a);
		if(a==0)
		
		System.out.println("Head");
		else
		System.out.println("tail");
	}
}