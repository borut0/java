import java.util.Scanner;
public class loops
{
	public static void main(String [] arg)
	{ 
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your choice from: \n1. while \n2. do while \n3. for");
		int ch=scan.nextInt();
		
		int n;
		System.out.println("Enter the number to find factorial:");
		n = scan.nextInt();
		int fact=1;
		if(n==0)
		{
			System.out.println("factorial of given no is " + fact);
		}
		else
  		{
		switch(ch)
		{
			case  1:
					while(n>=1)
					{
						fact=fact*n;
						n--;
					}
					System.out.println("factorial of given no is " + fact);
					break;
			case 2: 
					do
					{
						fact=fact*n;
						n--;
					}while(n>=1);
					System.out.println("factorial of given no is " + fact);
					break;
			case 3:
					int i;
				
					for(i=n;i>=1;i--)
					{
						fact=fact*i;
					}
					System.out.println("factorial of given no is " + fact);
					break;
			default:
					System.out.println("wrong choice: " );
					break;
		}
		}
	}
}