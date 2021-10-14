import java.util.Scanner;
public class matrix
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int a[][] = new int [3][3];
		int i,j;
		System.out.println("------Matrix-------");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print("Enter element for [" + i + "]" + "[" + j + "]:"); 
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("the matrix is: ");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
				System.out.println();
		}
	}
}