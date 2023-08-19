import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        if(start < 0 || end <0){
            return;
        }

        if(end > start){
            return;
        }

        System.out.println(S.substring(start, end));
    }
}
