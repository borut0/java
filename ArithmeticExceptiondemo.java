import java.util.Scanner;
public class ArithmeticExceptiondemo
{
	public static void main(String [] args)
	{
		 Scanner scan = new Scanner(System.in);
		 int a,b;
		 System.out.print("Enter the value of a = ");
		 a=scan.nextInt();
		 System.out.print("Enter the value of b = ");
		 b=scan.nextInt();
		try
		{
			if(a==b)
			{
				throw new ArithmeticException("values mush not be equal");
			}
			if(a>b)
			{
			System.out.println(a +" is greaterthen");
			}
			else
			{
			System.out.println(b +" is greaterthen");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception: " +e.getMessage());
		}
		System.out.println("progrma is over");
	}
}