import java.util.Scanner;
public class reverse
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int no,rev=0;
		System.out.print("Enter the value of no:");
		no = scan.nextInt();
		while(no!=0)
		{
			rev = (rev*10) + (no%10);
			no=no/10;
		}
		System.out.println("The reverse no. is " + rev);
	}
} 