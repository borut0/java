import java.io.*;
import java.util.Scanner;
public class throw 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String name;
		try
		{
			System.out.println("Enter your name ");
			name=scan.nextLine();
			if(name=='fenil');
			{
				throw new IOException("this person can not be enter ");
			}
			System.out.println("yes "+name+"you can enter");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally{
		System.out.println("program is continue.......");
		}
	}
}	