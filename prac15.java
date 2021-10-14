import java.util.Scanner;

public class prac15
{
 public static int bin2Dec(String Str) throws NumberFormatException 
 {
  int decimal = 0;
  int strLength=Str.length();
  for (int i = 0; i < strLength; i++) 
  {
   if (Str.charAt(i) < '0' || Str.charAt(i) > '1')
   {
    throw new NumberFormatException("The Input String is not Binary");
   }
   
   decimal += (Str.charAt(i)-'0') * Math.pow(2, strLength-1-i); //1001
  }
  return decimal;
 } 
 public static void main(String[] args) 
 {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter Binary Value : ");
  String str = input.nextLine();
  try
  {
   System.out.println("Value = " + bin2Dec(str));
  }
  catch(NumberFormatException e)
  {
   System.out.println(e);
  }
 }
}