import java.util.Scanner;
public class ifelse
{
	public static void main(String[] arg)
		{
			Scanner scan = new Scanner(System.in);
			int a;
			System.out.println("ENter the no.");
			a=scan.nextInt();
			System.out.println((a>0)? " it is positive no."	: "it is not positive no.");
		}
}			