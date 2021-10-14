package exception_4;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class Exception_4 {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://www1.gogoanime.ai/");
        System.out.println("protocol "+ url.getProtocol() +" host_name" + url.getHost()+" prot_name " + url.getPort() + " file "+url.getFile());
        URLConnection cn = url.openConnection();
        System.out.println("content-type is "+ cn.getContentType());
        int length = cn.getContentLength();
        System.out.println("lenght is "+ cn.getContentLength());
        int ch;
        if(length!=0)
        {
            InputStream is = cn.getInputStream();
            while((ch=is.read())!=-1){
                System.out.print((char)ch);
            }
        }
        else{
            System.out.println("There is no content");
        }
    }
    
}
