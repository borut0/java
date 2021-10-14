import java.util.Scanner;
public class searching
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int []a= new int[5];
		int i,j,middle;
		for(i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("which element you want to find?:");
		middle=scan.nextInt();
		if(a[i]/2==middle)
		{
			