import java.util.Scanner;
public class copyarraymethod
{
	public static void main(String args [])
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("HOW many element you want to enter:");
		int n = scan.nextInt();
		int a[]= new int [n];
		int copy[] = new int [n];
		System.out.println("Enter elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		System.arraycopy(a,0,copy,0,n);
		for(int j=0;j<copy.length;j++)
		{
			System.out.print(copy[j] + " ");
		}
	}
}

		