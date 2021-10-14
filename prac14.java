import java.util.ArrayList;
import java.util.Date;
public class prac14
{
	public static void main(String args[])
	{
		ArrayList <Object> f = new ArrayList <>();
		//f.add(new Loan(5000.50));
		f.add(new Date());
		f.add(new String("String class"));
		//f.add(new Circle(3.45));
		for(int i=0;i<f.size();i++)
		{
			System.out.println(f.get(i));
		}
	}
}