import java.util.Scanner;
public class prac9
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int a,b;
		System.out.println("Enter 1st no:");
		a = scan.nextInt();
		System.out.println("Enter 2nd no:");
		b = scan.nextInt();
		getGcd obj = new getGcd();
		obj.gotGcd(a,b);
	}
}
class getGcd
{
	void gotGcd(int a, int b)
	{
		 int gcd=1;
		 int i;
		{
			for(i=1 ; i<=a && i<=b ; i++)
			{
				if(a%i==0 && b%i==0)
				{
					gcd=i;
				}
			}
		System.out.println("The GCD of "+ a + " and " + b +" is " + gcd);
		}
	}
}
