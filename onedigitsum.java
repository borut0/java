import java.util.Scanner;
public class onedigitsum{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter no:");
        String str = scan.nextLine();
        for(int i=0;i<str.length();i++)
        {
            sum = sum + Integer.parseInt(str.substring(i,i+1));
        }
        System.out.print(sum);
    }
}