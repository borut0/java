import java.io.*;
import java.util.Scanner;
public class FileExample1
{
	public static void main(String args[]) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		int i;
		FileOutputStream f =new FileOutputStream("f:/programs/delete.txt",true);
		String s;
		System.out.println("Enter the name that you want to attach :");
		s=scan.nextLine();
		char ch[]=s.toCharArray();
		for(i=0;i<s.length();i++)
		{
			f.write(ch[i]);
		}
		f.close();
	}
}