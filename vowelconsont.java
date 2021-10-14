import java.util.Scanner;
public class vowelconsont
{
	public static void main(String [] arg)
		{
			Scanner scan = new Scanner(System.in);
			char a;
			System.out.println("Enter alphabet");
			a=scan.next().charAt(0);
			if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
			{
				System.out.println(a+" is vowel ");
			}
			else 
			{
				System.out.println(a+" is consont ");
			}
		}
}