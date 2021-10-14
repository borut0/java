package object_and_list;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Object_and_list {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(56);
        al.add(89);
        al.add(23);
        al.add(14);
       Iterator itr = al.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
       ListIterator itl =al.listIterator();
       
       System.out.println("second entent is:");
       while(itl.hasNext()){
           System.out.println(itl.next());
       }
       System.out.println("previous values is:");
       while(itl.hasPrevious()){
       System.out.println(itl.previous());
       }
    }
    
}
