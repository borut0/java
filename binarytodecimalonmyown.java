import java.util.*;
public class binarytodecimalonmyown
	{
    		public static void main(String args[]) throws NumberFormatException
    		{
   	     		Scanner scan = new Scanner(System.in);
       		 	double sum=0;
			System.out.println("Enter the binary no:");
			String str=scan.nextLine();
			for(int i=0;i<str.length();i++)
        		{
		        if(str.charAt(i)!='0' && str.charAt(i)!='1')
		        throw new NumberFormatException("The input string is not binary");
			
			}
       			 for(int i=str.length()-1,j=0;i>=0;i--,j++)         
        		{
        	    	sum = sum + (Integer.parseInt(str.substring(i,i+1))*Math.pow(2,j));
       			}
        		System.out.print(sum);
		}
	
    	}

