import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());
        
        if(A.charAt(0) > B.charAt(0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        StringBuffer sb1 = new StringBuffer(A);
        StringBuffer sb2 = new StringBuffer(B);

        String a = Character.toString(Character.toUpperCase(A.charAt(0)));
        String b = Character.toString(Character.toUpperCase(B.charAt(0)));

        sb1.replace(0,1, a);
        sb2.replace(0, 1, b);
        
        sb1.append(" ");
        sb1.append(sb2.toString());

        System.out.println(sb1.toString());
    }
}
