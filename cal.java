import java.util.Scanner;

public class cal
{
  public static void main(String args[])
{
  int a,b,add,sub,mul,div;
Scanner scan = new Scanner(System.in);

System.out.print("Enter Two no.");
a=scan.nextInt();
b=scan.nextInt();

add=a+b;
System.out.println("add is" + add);

div=a-b;
System.out.println("div is" + div);

mul=a*b;
System.out.println("mul is" + mul);

div=a/b;
System.out.println("div is" + div);

}
}