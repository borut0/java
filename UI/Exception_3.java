package exception_3;
import java.util.Scanner;
public class Exception_3 {
    public static void main(String[] args) {
        System.out.println("Enter a value:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        try{
        if(a<0)
        {
            throw new myException("must be positive");
        }
        else{
            System.out.println("no. is added");
        }
        }
        catch(myException e){
                    System.out.println("Exception gentered:" + e.getMessage());
                }
    }
    
}
class myException extends Exception{
    myException(String str){
        super(str);
    }
    }
