import java.util.Scanner;
public class fibonacci 
{
	public static void main(String [] arg)
	{ 
		Scanner scan = new Scanner(System.in);
		int n,n1=0,n2=1,n3,i;
		System.out.println("Enter how many count you wanna:");
		n= scan.nextInt();
		System.out.println("The fibonacci serices are: \n "+n1+" \n " + n2);
		for(i=2;i<n;i++)
		{
			n3=n1+n2;
			System.out.println(" " + n3);
			n1=n2;
			n2=n3;
		}
	}
}