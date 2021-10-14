import java.util.Scanner;
public class persentage
{
	public static void main(String[] arg)
	{
		Scanner scan = new Scanner (System.in);
		int maths,sci,eng,total;
		float ans;
		System.out.println("Enter marks of maths:");
		maths=scan.nextInt();
		System.out.println("Enter marks of sciences:");
		sci=scan.nextInt();
		System.out.println("Enter marks of english:");
		eng=scan.nextInt();
		total=maths+sci+eng;
		ans=(total*100)/300;
		System.out.println("Total Marks of all subjects are " + total + "and presentage you got is " + ans );
		if(ans>=80 || ans<=100)
			{ 
				System.out.println("And your grad is Disting");
			}
		else if(ans>=60 || ans<=80)
			{ 
				System.out.println("And your grad is First class");
			}
		else if(ans>=40 || ans<=60)
			{ 
				System.out.println("And your grad is second class");
			}
		else if(ans>=33 || ans<=40)
			{ 
		 
				System.out.println("And your grad is third class");
			}
		else if(ans<33)
			{
				 
				System.out.println("your fail");
			}
		}
}