public class car
	{
		String color;
		int prize;
		String company;
		public  void color(String c,int p,String co)
		{
			color=c;
			prize=p;
			company=co;
			System.out.println("car color is " + color + ", prize is " + prize + "and company is " + company);
		}
	}
public class car_1
	{
		public static void main(String [] args)
		{
			car cr = new car();
			cr.color("red",100000,"tata");
			
		}
	}