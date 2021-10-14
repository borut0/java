import java.util.Scanner;
public class decorace
{
  	public static void main(String [] arg)
		{
			Scanner scan = new Scanner (System.in);
			System.out.println("--------Menu-----------");
			System.out.println("1. Desending order");
			System.out.println("2. Acending order");
			System.out.println("Enter your choice:");
			int ch;
			ch=scan.nextInt();
			switch(ch)
		{
			case 1:	
			{
			int a,b,c;
			System.out.println("Enter 1st no.");
			a=scan.nextInt();
			System.out.println("Enter 2st no.");
			b=scan.nextInt();
			System.out.println("Enter 3st no.");
			c=scan.nextInt();

			int temp;
			if(a<c || a<b)
			{
				if(a<b)
				{
					temp=a;
					a=b;
					b=temp;
				}
				if(a<c)
				{
					temp=a;
					a=c;
					c=temp;
				}
			}
			if(b<c)
				{
					temp=b;
					b=c;
					c=temp;
				}
				System.out.println("decding order is :  " + a + "  "+ b +"  " + c);
				break;
			}
			case 2:	
			{
			int a,b,c;
			System.out.println("Enter 1st no.");
			a=scan.nextInt();
			System.out.println("Enter 2st no.");
			b=scan.nextInt();
			System.out.println("Enter 3st no.");
			c=scan.nextInt();

			int temp;
			if(a>c || a>b)
			{
				if(a>b)
				{
					temp=a;
					a=b;
					b=temp;
				}
				if(a>c)
				{
					temp=a;
					a=c;
					c=temp;
				}
			}
			if(b>c)
				{
					temp=b;
					b=c;
					c=temp;
				}
			System.out.println("Acending order is :  " + a + "  "+ b +"  " +c);
				break;
			}
			default:
			{
				System.out.println("wrong choice :(");
			}
                   }
		}
}
