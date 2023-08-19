import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String [] sArr = new String[]{
            "java",
            "cpp",
            "python"
        };
        int [] iArr = new int [] {
            100,
            65,
            50
        };
            // Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                // String s1=sc.next();
                // int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d\n",sArr[i], iArr[i]);
            }
            System.out.println("================================");
    }
}
