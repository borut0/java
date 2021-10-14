import java.util.Scanner;
public class factorial
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no.:");
		int no=scan.nextInt();
		Afactorial obj = new Afactorial();
		obj.fact(no);
	}
}
class Afactorial
{
	int facto=1;
	public void fact(int no)
	{
		if(no==0 || no==1)
		{
			System.out.println("The Answer of "+ no +"! is "+ facto);
		}
		else
		{
			System.out.println("The Answer of "+ no +"! is ");
			while(no>0)
			{
				facto=facto*no;
				no--;
			}
			System.out.print(facto);
		}
	}
}