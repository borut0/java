import java.util.Scanner;
public class smallest
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		int i,j,temp;
		System.out.println("Enter 5 integer:");
		for(i=0; i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		for(i=0; i<a.length;i++)
		{
			for(j=0; j<a.length-1;j++)    // (a.length -1) because in last a[5]>a[5+1] then a[6] is not possible 
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("shorted elements are:");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("smallest element is "+ a[0]);
	}
}