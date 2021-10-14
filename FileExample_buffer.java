import java.io.*;
public class FileExample_buffer
{
	public static void main(String args[]) throws IOException
	{
		FileWriter f =new FileWriter("delete.txt",true);
		BufferedWriter b= new BufferedWriter(f);
		b.write(" hello everyone how are you doing?");
		b.close();
	}
}