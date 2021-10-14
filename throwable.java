import java.io.*;
import java.util.Scanner;
public class throwable 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String name;
		int no;
		try
		{
			System.out.println("Enter your name ");
			name=scan.nextLine();
			no=scan.nextInt();
			if(no==50||no==45)
			{
				throw new ArithmeticException("you can not write this value");
			}
			System.out.println("ok you can");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally{
		System.out.println("program is continue.......");
		}
	}
}	