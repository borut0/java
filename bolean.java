import java.util.Scanner;
public class bolean
{
	public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			int n;
			boolean ok=true;
			System.out.println("Enter the value of n:");
			 n=scan.nextInt();
			
			if(ok)
			{
				if(n%2==0)
					{
						System.out.println("The " + n + " is even");
					}
				else
					{
						System.out.println("The " + n + "is odd");
					}
			}
			else
			{
				System.out.println("wrong integer");
			}
		}
}	
				