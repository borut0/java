import java.util.Scanner;
public class calcofsum
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int no,sum=0;
		System.out.println("Enter no bellow and if you want to terminate then enter -1");
		System.out.println("You can start here:");
		no=scan.nextInt();
		do
		{
			
			sum+=no;
			no=scan.nextInt();
		}while(no!=-1);
		System.out.println("The sum of given no is: " + sum);
	}
}
		