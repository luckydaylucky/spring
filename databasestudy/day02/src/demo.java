import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class demo {
    public static void main(String[] args) throw IOException{}{

      new Properties();
      InputStream in = new FileInputStream("day02/abc.txt");
      pro.load(in);
      Set<String> set = pro.stringPropertyNames();
      For(String key : set){
          System.out.println(key +" "+pro.getProperty(key));
        }

    }
}
