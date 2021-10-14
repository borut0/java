import java.util.Scanner;
class Account
{
	private int bal;
	public Account(int bal)
	{
		this.bal=bal;
	}
	public boolean isSufficientBalance(int w)
	{
		if(bal>w)
			return(true);	
		else 
			return(false);
	}
	public void withdraw(int amt)
	{
		bal=bal-amt;
		System.out.println("withdrawl money is "+amt);
		System.out.println("YOur current balance is "+bal);
	}
}
class Customer implements Runnable
{
	private String name;
	private Account account;
	public Customer(Account account,String n)
	{
		this.account=account;
		name=n;
	}
	public void run()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(name +" Enter amount to withdraw");
		int amt=scan.nextInt();
		synchronized(account)
		{
			if(account.isSufficientBalance(amt))
			{
				System.out.println(name);
				account.withdraw(amt);
			}
			else
			{
			System.out.println("Insufficient Balance");
			}
		}
	}
}
public class ThreadExample
{
	public static void main(String [] args)
	{
		Account a1 = new Account(1000);
		Customer c1 = new Customer(a1,"Nita"),c2=new Customer(a1,"Nitesh");
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
	}
}