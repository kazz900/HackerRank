import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String A = "madam";

        char [] chars = A.toCharArray();
        char [] reversed = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            char temp = chars[i];
            reversed[i] = chars[chars.length - i - 1];
            chars[i] = temp;
        }


        String B = String.valueOf(reversed);

        if(A.equals(B)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
