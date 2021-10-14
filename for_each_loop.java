import java.util.Scanner;
public class for_each_loop
{
	public static void main(String args[])
	{
		int no;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the lenght :");
		no=scan.nextInt();
		int a[] = new int [no];
		System.out.println("Enter the no for array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("after Scaning all the elements");
		for(int f:a)
		{
			System.out.println(f);
		}
	}
}