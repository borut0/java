package print_text_to_file;
import java.io.*;
import java.util.Scanner;
public class Print_text_to_file {
    public static void main(String[] args) throws FileNotFoundException, IOException ,Exception {
            Scanner scan = new Scanner(System.in);
////        PrintWriter pw = new PrintWriter("input.txt");
////        pw.print("hello how are, hope you doing fine");
////        pw.close();
////        Scanner scan = new Scanner(new File("input.txt"));
////        System.out.println(scan.nextLine());
////          FileInputStream fs = new FileInputStream("input.txt");
////          System.out.printf("available charater is "+fs.available());
////          int ch = fs.available();
////          System.out.println("content is:");
////          for(int i=0;i<ch;i++){
////              System.out.print((char)fs.read());
////          }
////          fs.skip(ch);
////          System.out.println();
////          System.out.println(fs.available());
////          fs.close();
////            String content = "hello can you plsease speake true ";
////            byte ch[]=content.getBytes();
////            int length =ch.length;
////            FileOutputStream fo = new FileOutputStream("input.txt");
////            for(int i=0;i<length;i++){
////                fo.write(ch[i]);
////            }
////            System.out.println("work is done");
////            fo.close();
////              DataOutputStream dos = new DataOutputStream(new FileOutputStream("input.txt"));
////              dos.writeUTF("Enter name:");
////              dos.writeBytes("fenil");
////              dos.writeUTF("Enter height:");
////              dos.writeDouble(50.2);
////              dos.writeUTF("any charater:");
////              dos.writeChar('a');
////              dos.close();
////              DataInputStream di = new DataInputStream(new FileInputStream("input.txt"));
////             // for(int i=0;i<2;i++){\
////                int ava =di.available();
////               for(int i=0;i<ava;i++){   
////              System.out.println((char)di.read());
////               }
////              di.close();
//             // }
//                    try{
//                   
//                   BufferedOutputStream bous = new BufferedOutputStream(new FileOutputStream("input1.txt"));
//                   String str ="hello every one let's start";
//                   byte b[] = str.getBytes();
//                   bous.write(b);
//                   bous.flush();
//                   bous.close();
//                   BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input.txt"));
//                   BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("input1.txt"));
//                   BufferedOutputStream bous1 = new BufferedOutputStream(new FileOutputStream("3rd_text_file.txt"));
//                           
//                   SequenceInputStream sos = new SequenceInputStream(bis,bis1);
//                   int i;
//                   while((i=sos.read())!=-1){
//                      bous1.write(i);
//                   }
//                   bis.close();
//                   bis1.close();
//                   bous1.close();
//                   sos.close();
//                    }
//                    catch(FileNotFoundException e){
//                        return;
//                    }
//          
//                DataOutputStream dos = new DataOutputStream(new FileOutputStream("input.txt"));
//                dos.writeInt(65);
//                dos.write(565);
//                dos.writeChars("hello how are you");
//                System.out.println(dos.size());
//                dos.flush();
//                dos.close();
//                System.out.println("success");
//                String str = "hello how are you-guys!";
//                String[] split = str.split("-");
//                for(int i=0;i<split.length;i++){
//                    System.out.print(split[i]);
//                }
//                    try{
//                    Writer w = new FileWriter("input.txt");
//                    String str = "let's go ready or not let's go ";
//                    w.write(str);
//                    w.flush();
//                    w.close();
//                    System.out.println("success");
//                    Reader r = new FileReader("input.txt");
//                    int data = r.read();
//                    while(data!=-1){
//                        System.out.print((char)data);
//                        data=r.read();
//                    }
//                    }
//                    catch(FileNotFoundException e){
//                        return;
//                    }
//                try{
//                      FileWriter fw = new FileWriter("input.txt");
//                      fw.write('!');
//                      fw.write("ok ok ");
//                      fw.flush();
//                      fw.close();
//                      System.out.print("Success");
//                      FileReader fr = new FileReader("input.txt");
//                      int i;
//                      while((i=fr.read())!=-1){
//                          System.out.print((char)i);
//                      }
//                    }
//                catch(FileNotFoundException e){
//                    return;
//                }
//                        FileWriter writer = new FileWriter("input.txt");  
//    BufferedWriter buffer = new BufferedWriter(writer);  
//    buffer.write("Welcome to javaTpoint.");  
//    buffer.close();  
//    System.out.println("Success"); 
//    FileReader fr=new FileReader("input.txt");    
//          BufferedReader br=new BufferedReader(fr);    
//  
//          int i;    
//          while((i=br.read())!=-1){  
//          System.out.print((char)i);  
//          }  
//          br.close();    
//          fr.close();  
//            FileOutputStream fops = new FileOutputStream("input.txt");
//            PrintStream ps = new PrintStream(fops);
//            ps.println("thank you so much");
//            ps.flush();
//            ps.close();
//            System.out.println("success");


        //////////////////Examples//////////////////////////////////////////
        /////////////////Example_1//////////////////////////////////////////
//            try{
//            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input.txt"));
//           int temp;
//           String fullstr = "";
//            while((temp=bis.read())!=-1){
//                fullstr+=(char)temp;
//                
//            }
//                String str[]=fullstr.split(" ");
//                int count=0;
//                System.out.print("Enter the string that you want to change:");
//                String change=scan.nextLine();
//                for(int i=0;i<str.length;i++){
//                    if(str[i].equals(change)){
//                        count++;
//                    }
//                }
//                System.out.println("Enter word you want to replace:");
//                String repl = scan.nextLine();
//                String newstr= fullstr.replace(change, repl);
//                BufferedWriter bis1 = new BufferedWriter(new FileWriter( new File("input1.txt")));
//                bis1.write(newstr);
//                bis1.flush();
//                bis1.close();
//                System.out.println("Success");
//            }
//            catch(FileNotFoundException e){
//                return;
//            }
             /////////////////Example_2//////////////////////////////////////////
             String argument0 = args[0];
             File file = new File(args[0]);
            if(file.exists()){
                System.out.printf("file is exitst");
                
            }
            else{
                System.out.println("file not found");
            }
            
    }
    
}
