import java.util.Scanner;
public class maths
{
	public static void main(String[] arg)
	{
	
		Scanner scan = new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter two no.:");
		n1=scan.nextInt();
		n2=scan.nextInt();
		System.out.println("max no. is " + Math.max(n1,n2));
		System.out.println("min no. is " + Math.min(n1,n2));
	
	}
}