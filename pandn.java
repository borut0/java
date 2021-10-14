import java.util.Scanner;
public class pandn
{
	public static void main(String arg[])
{
	Scanner scan = new Scanner(System.in);
	int n;
 	System.out.println("Enter the no.");
	n=scan.nextInt();
	if(n>0)
	{
		System.out.println("Positive");
	}
	else if(n<0)
	{
		System.out.println("negative");
	}
	else 
	{
		System.out.println("Zero");
	}
}
}  