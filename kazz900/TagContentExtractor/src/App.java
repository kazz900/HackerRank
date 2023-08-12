import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class App {
    public static void main(String[] args) {
        String[] str = new String[] {
                "<h1>Nayeem loves counseling</h1>",
                "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>",
                "<Amee>safat codes like a ninja</amee>",
                "<SA premium>Imtiaz has a secret crush</SA premium>"
        };
        // Scanner in = new Scanner(System.in);\
        // int testCases = Integer.parseInt(in.nextLine());
        int testCases = 4;
        int tempIndex = 0;
        while (testCases > 0) {
            String line = str[tempIndex];
            String openingTagPattern = "(<[a-zA-Z\\d\\s]{1,2}>)+";
            String closingTagPattern = "(</[a-zA-Z\\d\\s]{1,2}>)+";
            Pattern openingTagRegex = Pattern.compile(openingTagPattern);
            Pattern closingTagRegex = Pattern.compile(closingTagPattern);
            Matcher m1 = openingTagRegex.matcher(line);
            Matcher m2 = closingTagRegex.matcher(line);
            String 
            tempIndex++;
            testCases--;
        }
    }
}