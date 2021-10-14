import java.util.Scanner;
public class prac13
{
	public static void main(String args[]) throws NumberFormatException
	{
		String str,a;
		int ans=0;
		int i=0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter Equation:");
		str = scan.nextLine();
		a = str.replaceAll(" ","");
		
		
		if(a.length()<3)
		{
			System.out.println("The string must be include two oprand and one operator");
			System.exit(0);
		}
		for(i=0; a.charAt(i)!='+' && a.charAt(i)!='-' && a.charAt(i)!='*' && a.charAt(i)!='/';i++);
		switch(a.charAt(i))
		{
			case '+':
			ans=Integer.parseInt(a.substring(0,i)) + Integer.parseInt(a.substring(i+1,a.length()));
			break;
			case '-':
			ans=Integer.parseInt(a.substring(0,i)) - Integer.parseInt(a.substring(i+1,a.length()));
			break;
			case '*':
			ans=Integer.parseInt(a.substring(0,i)) * Integer.parseInt(a.substring(i+1,a.length()));
			break;
			case '/':
			ans=Integer.parseInt(a.substring(0,i)) / Integer.parseInt(a.substring(i+1,a.length()));
			break;
		}
		System.out.println(a.substring(0,i) + " " +a.charAt(i)+" "+ a.substring(i+1,a.length()) + " = " +ans);
	}
}
			
	
		