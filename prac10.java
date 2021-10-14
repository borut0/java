import java.util.Scanner;
public class prac10
{
	public static void main(String [] args)
	{
		int a[] = new int [10]; 
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		for(i=0;i<a.length;i++)
		{
		System.out.print("Enter [" + i + "] number:");
		a[i]=scan.nextInt();
		}
		System.out.println("Entered elements is:");
		Printing(a);
		System.out.println("The reverse no's are :");
		reverse(a);
	}
	static void Printing(int a[])
	{
		int i;
		for(i=0;i<a.length;i++)
		{
			System.out.println("[" +i + "]=" + a[i]);
		}
	}
	 static void reverse(int a[])
		 {
			int i;
			for(i=9;i>0;i--)
			{
				
				System.out.print(a[i] +",");
			}
		}
}
		
			