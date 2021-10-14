import java.io.*;
public class io_example_2
{
	public static void main(String args[]) throws Exception
	{
		Boolean status;
		String argument0 = args[0];
             	File file = new File(args[0]);
           	if(file.exists()){
			status=true;
                	System.out.printf("file is exitst");
            			}
           	 else{
               		 System.out.println("file not found");
           			}
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		String key=args[1];
		while((line=br.readLine())!=null)
		{
			String []data = line.split(" ");
			for(String e:data)
			{
				if(e.equalsIgnoreCase(key))
				{
					System.out.println(key+" is present in the line " + line);
				}
			}
		} 
	}
}