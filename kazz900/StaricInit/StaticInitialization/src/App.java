import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args)throws IOException, NumberFormatException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int breadth = Integer.parseInt(br.readLine());
        int height = Integer.parseInt(br.readLine());
        
        if(breadth <= 0 || height <= 0){
            bw.write("java.lang.Exception: Breadth and height must be positive");
            bw.flush();
        }else{
            int area = breadth * height;
            String m = Integer.toString(area);
            bw.write(m);
            bw.flush();
        }
        bw.close();
    }
}
