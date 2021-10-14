import java.util.Scanner;
public class 2dmatrix
{
	public static void main(String args[])
	{
		int a[][]= new int[3][3];
		int i,j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter element in matrix:");
		
			for(i=0;i<a.length;i++)
			{
				for(j=0;j<a.length;j++)
				{
					a[i][j]=scan.nextInt();
				}
			}
		System.out.println("Entered elements are :");
		for(i=0;i<a.length;i++)
			{
				for(j=0;j<a.length;j++)
				{
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}
}	