import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt(); //2

        int previousResult = 0;
        String result = "";
        for(int i=0;i<t;i++){
            int a = in.nextInt(); //0   5
            int b = in.nextInt(); //2   3
            int n = in.nextInt(); //10  5

            for (int j = 0; j < n; j++) {
                result += new String(Integer.toString(previousResult + a + (int) Math.pow(2,j) * b) + " ");
                // previousResult(0) + a(0) + b(2)^0 * b(2) = 0 + 0 + 1 * 2 = 2
                // previousResult(2) + a(0) + b(2)^1 * b(2) = 2 + 0 + 2 * 2 = 6
                // previousResult(6) + a(0) + b(2)^2 * b(2) = 6 + 0 + 4 * 2 = 14

                // previousResult + a(5) + b(3)^0 * b(3) = 0 + 5 + 1 * 3 = 8
                // previousResult + a(5) + b(3)^1 * b(3) = 8 + 5 + 3 * 3 = 9 + 5 + 3 * 3 = 14 + 9 = 23
                // previousResult + a(5) + b(3)^2 * b(3) = 0 + 5 + 1 * 3 = 8
                previousResult = previousResult + (int) Math.pow(2,j) * b;

                // result = a + (int) Math.pow(2, j) * b
                //5 + 1 * 3 = 8
                //8 + 5 * 2 * 3 =  
            }
            System.out.println(result);
            result = "";
            previousResult = 0;
        }
        in.close();
    }
}
