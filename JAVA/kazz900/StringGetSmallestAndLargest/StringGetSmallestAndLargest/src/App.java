import java.util.Scanner;

public class App {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        //Total number of substrings = String's lenghth - (k - 1)
        String [] subStrings = new String[s.length() - (k - 1)];
        //Initialization values
        for (int i = 0; i < subStrings.length; i++) {
            subStrings[i] = "";
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        for (int i = 0; i <= s.length() - k ; i++) {
            String substr = s.substring(i, i + k);
            if (substr.matches("[a-zA-Z]+")) {
                subStrings[i] = substr;
            }
        }

        for (int i = 0; i < subStrings.length - 1; i++) {
            for (int j = i + 1 ; j < subStrings.length; j++) {
                if(subStrings[i].compareTo(subStrings[j]) > 0){
                    String temp = subStrings[i];
                    subStrings[i] = subStrings[j];
                    subStrings[j] = temp;
                }
            }
        }

        smallest = subStrings[0];
        largest = subStrings[subStrings.length - 1];


        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String s = scan.next();
        // int k = scan.nextInt();
        scan.close();
        String s = "welcometojava";
        int k = 3;
        System.out.println(getSmallestAndLargest(s, k));
    }
}