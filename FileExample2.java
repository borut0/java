import java.io.*;
public class FileExample2
{
	public static void main(String args[]) throws IOException
	{
		int i;
		FileInputStream f = new FileInputStream ("./indian constitutions.txt");
		
		do
		{
		i=f.read();
		if(i!=-1)
		System.out.print((char)i);
		}while(i!=-1);
		f.close();
	}
}