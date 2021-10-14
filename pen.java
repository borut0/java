class ppen
{
	private int pri;
	private String ucol;
	private String icol;
	void ppen(int pri,String ucol,String icol)
	{
		this.pri=pri;
		this.ucol=ucol;
		this.icol=icol;
		System.out.println("pen's prize is " + pri + ",inner colour is "+ icol + "outer colour " + ucol );
	}
}
public class pen
	{
		public static void main(String args [])
		{
			ppen pn =new ppen();
			pn.ppen(20,"red","blue");
		}
	}
