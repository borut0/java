import java.util.Scanner;
public class metertofeet
{
	public static void main(String[] arg)
	{
		Scanner scan = new Scanner (System.in);
		int i=0,a,feet;

		while(i<5)
		{
			
			System.out.println("Enter\t" + i +"\tthe magerment in meter:");
			a=scan.nextInt();
			feet=a*3;
			System.out.println(" -> " + a +" meter in to feet is " + feet);
			i++;
			
		}
	}
}