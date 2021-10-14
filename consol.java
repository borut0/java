import java.io.Console;
public class consol{
	public static void main(String args[])
	{
		Console console = System.console();
		System.out.print("Enter your name: ");
		//console.readLine();
		System.out.print("\nEnter new password: ");
		char psw[] =console.readPassword();
		System.out.print("\nconform password:");
		char pswcon[]=console.readPassword();
		String pswdcon=String.valueOf(pswcon);
		String pswd=String.valueOf(psw);
		
		if(pswd.equals(pswdcon))
		{
			System.out.println("you can access");
		}
		else
		{
			System.out.println("access deney");
		}
	}
}