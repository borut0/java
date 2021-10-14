import java.util.Scanner;
public class marks
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int a[]=new int[6];
		int maths[]=new int[6];
		int comp[]=new int[6];
		int comm[]=new int[6];
		int avg[]=new int[6];
		int i,data;
		System.out.println("-----------Markshit:----------");
		for(i=1;i<a.length;i++)
		{
			System.out.println("Enter marks of student [" + i + "]" );
			System.out.print("Maths:");
			maths[i]=scan.nextInt();
			System.out.print("computer:");
			comp[i]=scan.nextInt();
			System.out.print("communication:");
			comm[i]=scan.nextInt();
		}
		for(i=1;i<a.length;i++)
		{
			avg[i]=(maths[i]+comp[i]+comm[i])/3;
		}
		for(i=1;i<a.length;i++)
		{
			System.out.println("The marks of student [" + i + "] is" );
			System.out.println("Maths:- " + maths[i] );
			System.out.println("computer:- " + comp[i]);
			System.out.println("communication:- " + comm[i]);
			System.out.println("Average:- " + avg[i]);
		}
	}
}
			