import java.util.Scanner;
public class howtofindpower
{
	public static void main(String args[])
	{
		int ans=1;
		Scanner fenil = new Scanner(System.in);
		System.out.print("Enter number:");
		int no=fenil.nextInt();
		System.out.print("Enter power:");
		int p=fenil.nextInt();
		while(p>0)
		{	
			ans = ans*no;
			p--;
		}
		System.out.println("The Ans is :"+ans);
	}
}	