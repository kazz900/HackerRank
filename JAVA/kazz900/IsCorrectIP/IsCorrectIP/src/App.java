import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class App{

    public static void main(String[] args){
        // Scanner in = new Scanner(System.in);
        // while(in.hasNext()){
        //     break;
        // }
        String IP = "23.45.12.56";
        System.out.println(IP.matches(new MyRegex().pattern));
    }
}

//Write your code here
class MyRegex{
    // String pattern = "[0{3}-255]\\.[0{3}-255]\\.[0{3}-255]\\.[0{3}-255]";
    String pattern = "^(([0-255]|[0-255]|[0-255]|[0-255])(\\.(?!$)|$)){4}$";
}