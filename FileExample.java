import java.io.*;
public class FileExample
{
	public static void main(String [] args) throws IOException
	{
		File f=new File("f:/programs/delete.txt");
		f.createNewFile();
		System.out.println("Is exist? " +f.exists());
		System.out.println("Is file read? " +f.canWrite());
		System.out.println("File name? " +f.getName());
		System.out.println("Length of file? " +f.length());
		
	}
}