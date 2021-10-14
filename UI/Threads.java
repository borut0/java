package threads;
//class A implements Runnable{
//    public void run(){

import java.util.Scanner;

//     
//         int i;
//         for(i=0;i<10;i++){
//        System.out.println("A runs");
//         }
//    }
//}
//class B implements Runnable{
//    public void run(){
//        int i;
//        for(i=0;i<10;i++){
//            System.out.println("B runs");
//        }
//    }
//}

public class Threads {

    public static void main(String[] args) {
//        Thread t1 = new Thread(new A());
//        Thread t2 = new Thread(new B());
//        t1.start();
//        t2.start();
//        A t1 = new A();
//        B t2 = new B();
//        t1.start();
//        t2.start();
            Account acc = new Account(1000);
            Customer c1 = new Customer(acc,"kenil");
            Customer c2 = new Customer(acc,"hinal");
            Thread t1 = new Thread(c1);
            Thread t2 = new Thread(c2);
            t1.start();
            t2.start();
    }
    
}
class Account{
    int bal;
    
    Account(int bal){
    this.bal=bal;
}
    public Boolean isbasisava(int wd){
        if(bal>wd){
            return(true);
        }
        else{
            return(false);
        }
    }
    public void withdraw(int amt){
        bal=bal-amt;
        System.out.print("withdraw amount:"+amt);
        System.out.println("availabel balance is:"+bal);
    }
}
 class Customer implements Runnable{
     Account account;
     String name;
     Customer(Account account,String n){
         this.account=account;
         this.name=n;
     }
    public void run() {
       Scanner scan = new Scanner(System.in);
       System.out.print(name+", Enter amount to withdraw:");
       int amt = scan.nextInt();
       synchronized(account){
       if(account.isbasisava(amt)){
           System.out.println(name);
           account.withdraw(amt);
       }
       else{
           System.out.println("balance is not available");
       }
    } 
    }
    }
//class A extends Thread{
//    public void run(){
//            int i;
//        for(i=0;i<20;i++){
//            System.out.println("A run");
//        }
//    }
//}
//class B extends Thread{
//    public void run(){
//            int i;
//        for(i=0;i<20;i++){
//            System.out.println("B run");
//        }
//    }
//}


