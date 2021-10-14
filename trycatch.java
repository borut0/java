import java.util.Scanner;
import java.io.*;
public class trycatch
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner (System.in);
		int a,b,ans;
		try
		{
			System.out.println("Enter two numbers:");
			a=scan.nextInt();
			b=scan.nextInt();
			ans=a/b;
			System.out.println("ans is "+ans); 
		}
		catch(ArithmeticException e)
		{
			System.out.println("huh noob!"+e.getMessage());
		}
		finally
		{
			System.out.println("progrma is running......");
		}
	}
}