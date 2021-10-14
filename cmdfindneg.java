import java.util.Scanner;
public  class cmdfindneg
{
	public static void main(String args[])
	{	
		System.out.println("The elements are:");
		for(int i=0;i<args.length;i++)
		{
			System.out.print(args[i] + " ");
		}
		System.out.println("\nThe negative nos is:");
		for(int j=0;j<args.length;j++)
		{
			int no = Integer.parseInt(args[j]);
			if(no<0)
			{
				System.out.print(no + " ");
			}
		}
	}
}
 