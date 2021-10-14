import java.io.*;
public class FileExample_bufferread
{
	public static void main(String args[]) throws IOException
	{
		int ch;
		BufferedReader b = new BufferedReader(new FileReader("delete.txt"));
		while((ch=b.read())!=-1)
		{
			System.out.print((char)ch);
		}
		b.close();
	}
}