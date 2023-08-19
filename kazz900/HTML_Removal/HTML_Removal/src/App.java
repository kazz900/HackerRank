import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class App {
    public static void main(String[] args) {
        String[] str = {
                "<h1>Nayeem loves counseling</h1>",
                "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>",
                "<Amee>safat codes like a ninja</amee>",
                "<SA premium>Imtiaz has a secret crush</SA premium>"

        };
        // Scanner in = new Scanner(System.in);
        // int testCases = Integer.parseInt(in.nextLine());
        int testCases = 4;
        int index = 0;
        while (testCases > 0) {
            String line = str[index];
            String openingTagPatern = "(<[a-zA-Z\\d\\s]{1,}>)+";
            String closingTagPattern = "(</[a-zA-Z\\d\\s]{1,}>)+";
            Pattern openingTagRegex = Pattern.compile(openingTagPatern);
            Matcher m1 = openingTagRegex.matcher(line);
            Pattern closingTagRegex = Pattern.compile(closingTagPattern);
            Matcher m2 = closingTagRegex.matcher(line);

            String openingTag = "";
            String closingTag = "";
            if (m1.find()) {
                openingTag = m1.group();
            }
            if (m2.find()) {
                closingTag = m2.group();
            }

            String s1 = openingTag.replaceAll("[<>]", "") + "";
            String s2 = closingTag.replaceAll("[<>]", "");
            if(s2.charAt(0) != '/'){
                System.out.println("none");
                testCases--;
                index++;
                continue;
            }
            for (int i = 0; i < s2.length(); i++) {
                // TODO CONTINUE FROM HERE, IMPLEMENT COMPARISON OF S1 AND S2
                // SO THAT WE CAN KNOW OPENING TAG AND CLOSING TAG MATCHES OR NOT
            }         
            // Write your code here

            testCases--;
            index++;
        }
    }
}