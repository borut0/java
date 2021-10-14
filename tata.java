import java.util.Scanner;
class maths
{
	int n,no;
	int sum(int n, int no)
	{
		int nom;
		nom=n+no;
		return nom;
	}
	int div(int nom)
	{
		return nom/2;
	}
}

public class tata
	{
		public static void main(String [] args)
		{
			Scanner scan = new Scanner(System.in);
			int n1,n2;
			System.out.print("n1= \n n2=");
			n1=scan.nextInt();
			n2=scan.nextInt();
			maths m = new maths();
			int a=m.sum(n1,n2);
			System.out.println(" the sum is " + a + " and div by 2 is " + m.div(a));
		}
	}
				