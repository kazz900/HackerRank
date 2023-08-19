import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int [] stdin = new int[]{
            42,
            100,
            125
        };
        for (int i = 0; i < stdin.length; i++) {
            System.out.println(stdin[i]);
        }
    }
}