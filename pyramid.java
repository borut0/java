public class pyramid 
{
	public static void main(String [] args)
	{
		int a[][] = new int [3][3];
		int i,j;
		System.out.println("------Matrix-------");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print("* "); 
			}
				System.out.println();
		}
	System.out.println();
		for(i=0;i<a.length;i++)
		{
			for(j=i;j<a.length;j++)
			{
				System.out.print("* "); 
			}
				System.out.println();
		}
		
	}
}