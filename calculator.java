import java.util.Scanner;
public class calculator
{ 
	public static void main(String []arg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter you choice +,-,*,/,%");
		char ch=scan.next().charAt(0);
		

		System.out.println("Enter value of A & B:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		switch(ch)
		{
			case '+':
				System.out.println("A+B=" +(a+b));
				break;
			case '-':
				System.out.println("A-B=" +(a-b));
				break;
			case '*':
				System.out.println("A*B=" +(a*b));
				break;
			case '/':
				System.out.println("A/B=" +(a/b));
				break;
			case '%':
				System.out.println("A%B=" +(a%b));
				break;
			default:
				System.out.println("wrong choice");
		}
	}
}