public class OverloadingMethods {
	public static void main(String [] args)
	{
		int ans1= sum(5,2);
		int ans2= sum(5,2,6);
		int ans3= sum(5,2,5,8);
		System.out.println("1." + ans1 + "\n2." + ans2 + "\n3." + ans3); 
	}
	public static int sum(int x, int y)
		{
			return (x + y);
		}
	public static int sum(int x,int y,int z)
		{
			return (x + y + z);
		}
		public static int sum(int x,int y, int z, int a)
		{
			return (x + y + z + a);
		}
	}