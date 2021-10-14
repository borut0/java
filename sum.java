class asum
{
	public void isSum(int x,int y)
	{
		System.out.println("sum is " + (x+y));
	}
}
public class sum
{
	public static void main(String [] args)
	{
		
		asum obj = new asum();
		obj.isSum(8,8);
		obj.isSum(4,5);
		obj.isSum(22,8);
	}
}