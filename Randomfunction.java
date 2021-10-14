import java.util.Random;
public class Randomfunction
{
	public static void main(String args[])
	{
		Random rand = new Random();
		int no;
		for(int i=0;i<100;i++)
		{
			System.out.print(rand.nextInt(49)+" ");
		}
	}
}
