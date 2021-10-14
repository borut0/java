import java.util.Scanner;
public class findavgusingarray
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int avg,sum=0,i;
		int[] matrix = new int[5];
		for(i=0;i<matrix.length;i++)
		{
			System.out.print("Enter ["+i+"] = ");
			matrix[i]=scan.nextInt();
			
		}
		for(i=0;i<matrix.length;i++)
		{
			sum=sum+matrix[i];
		}
		avg=sum/matrix.length;
		System.out.println("Avrage of given no is :"+avg);
	}
}
		
		