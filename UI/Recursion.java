package recursion;
import java.util.Scanner;
public class Recursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter no to calculate factorial:");
//        int n;
//        n = scan.nextInt();
//        System.out.println("The ans is :"+findfactorial(n));
//    }
//    public static int findfactorial(int n){
//        int ans=1;
//        if(n==0){
//            return 1;
//        }else{
//        return n*findfactorial(n-1);
//        }
    
//          int i,n;
//          System.out.print("Enter how many elements you want to enter:");
//          n = scan.nextInt();
//          int a[] = new int[n];
//          System.out.println("Enter the elements:");
//          for(i=0;i<a.length;i++){
//              a[i]=scan.nextInt();
//          }
//          System.out.println("you entered numbers is:");
//          for(i=0;i<a.length;i++){
//              System.out.println(a[i]);
//          }
//          System.out.print("Enter the key that you want to search:");
//          int key = scan.nextInt();
//          int index =recursivebinarysearch(a,key);
//        
//    }
//        public static recursivebinarysearch(int []a,int key){
//        return binarysearch(a,0,a.length-1,key);
//    }
//    public static binarysearch(int a[],int start , int end,int key){
//        int middle = (start+end)/2;
//        if(end<start){
//            return -1;
               System.out.println("Where you want to end?:");
               int n = scan.nextInt();
               for(int i=0;i<n;i++){
                   System.out.print(fb(i) + " ");
               }
}

    private static int fb(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fb(n-2)+fb(n-1);
    }    
}
