import java.util.Scanner;
public class array
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int fm[]=new int[5];
		int i,max,j,temp;
		for(i=0;i<fm.length;i++)
		{
			System.out.print("Enter the no. [" + (i) + "] :");			
			fm[i]=scan.nextInt();
		}
		System.out.println("The numbers are:"); 
		for(i=0;i<fm.length;i++)
		{
			System.out.println(fm[i]);
		}
		max=fm[0];
		for(i=0;i<fm.length;i++)
		{
			if(fm[i]>=max)
			{
			max=fm[i];
			}
		}
		System.out.print("The maximun no. is "+ max );	
		for(i=0;i<fm.length;i++)
		{
			for(j=i+1;j<fm.length;j++)
				{
					if(fm[i]<fm[j])
					{
						temp=fm[i];
						fm[i]=fm[j];
						fm[j]=temp;
					}
				}
		}
		System.out.println("\n acending order is:"); 
		for(i=0;i<fm.length;i++)
		{
			System.out.println(fm[i]);
		}
		for(i=0;i<fm.length;i++)
		{
			for(j=i+1;j<fm.length;j++)
				{
					if(fm[i]>fm[j])
					{
						temp=fm[i];
						fm[i]=fm[j];
						fm[j]=temp;
					}
				}
		}
		System.out.println("\n decsending order is:"); 
		for(i=0;i<fm.length;i++)
		{
			System.out.println(fm[i]);
		}
	}
}