package generics;
import java.util.*;
public class Generics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//      
//        getarray<Integer> obj = new getarray<>();
//        getarray<Double> obj1 = new getarray<>();
//        System.out.println(obj.getans(89));
//        System.out.println(obj1.getans(90));
            
            System.out.println("How many elements you want to enter:");
            int n = scan.nextInt();
            int ele[] = new int[n];
            System.out.println("Enter Integer elements:");
            for(int i=0;i<n;i++)
            {
                ele[i] = scan.nextInt();
            }
         Stack<Integer> obj = new Stack<Integer>(n); 
         for(int j=0;j<n;j++){
         obj.push(ele[j]);
         }
         
         obj.display();
         obj.pop(ele[2]);
         obj.pop(ele[1]);
         obj.pop(ele[0]);
         obj.pop(ele[2]);
         obj.display();
    }
    
}
class Stack<F>{
    ArrayList<F> arobj;

    Stack(int size) {
        arobj = new ArrayList<F>(size);
    }
    void push(F item){
        arobj.add(item);
    }
    void pop(F item ){
        if(arobj.isEmpty()){
            System.out.println("The stack is empty");
        }
        else{
        arobj.remove(arobj.size()-1);
        
        }
    }
    void display(){
        System.out.print(arobj + " ");
    }
}
//class getarray<T>{
//   
//    int getans(int a){
//       return  5+a;
//    }
//} 