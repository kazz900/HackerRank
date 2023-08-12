import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class App {
    public static void main(String[] args) {
        String[] str = new String[] {
                // "<h1>Nayeem loves counseling</h1>",
                "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>"
                // "<Amee>safat codes like a ninja</amee>",
                // "<SA premium>Imtiaz has a secret crush</SA premium>"
        };

        // 사랑해 I love you ♥
        // 사랑한다 유미이 히힣힣
        // 바보 빠이
        //
        // Scanner in = new Scanner(System.in);
        // int testCases = Integer.parseInt(in.nextLine());
        int testCases = 1;
        int tempIndex = 0;
        while (testCases > 0) {
            String line = str[tempIndex].trim(); // ^[a-z] != bc
            ArrayList<String>tags = new ArrayList<String>();
            String newStr = line;
            int index1 = 0;
            int index2 = 0;
            for (int i = 0; i < line.length(); i++) {
                while(index1 != -1 && index2 != -1){
                    index1 = newStr.indexOf("<");
                    index2 = newStr.indexOf(">");
                    tags.add(line.substring(index1, index2 + 1));
                    newStr = line.substring(index2, newStr.length());
                    System.out.println(tags);
                    //TODO : IMPLEMENT ALGORITHM HERE
                }
            }
            tempIndex++;
            testCases--;
            // Pattern openingTagRegex = Pattern.compile("(<[a-zA-Z\\d\\s]+>)+");
            // Pattern closingTagRegex = Pattern.compile("(</[a-zA-Z\\d\\s]+>)+");
            // Pattern test = Pattern.compile(">(<[a-zA-Z\\d\\s]+>)+");
            // Matcher m1 = openingTagRegex.matcher(line);
            // Matcher m2 = closingTagRegex.matcher(line);
            // Matcher m3 = test.matcher(line);
            // String openingTag = "";
            // String closingTag = "";
            // String testStr = "";
            // if (m1.find()) {
            //     openingTag = m1.group().replaceAll("[/<>]+", "").trim();
            // }
            // if (m2.find()) {
            //     closingTag = m2.group().replaceAll("[/<>]+", "").trim();
            // }
            // if(m3.find()){
            //     testStr = m3.group().replaceAll("[/<>]+", "").trim();
            //     System.out.println(testStr + " : " + line);
            // }
            // if (openingTag.length() != closingTag.length()) {
            //     // System.out.print("Error 01 : " + openingTag + ", " + closingTag + "\n" + line + " : " + "None" + "\n");
            //     tempIndex++;
            //     testCases--;
            //     continue;
            // }
            // if (!openingTag.equals(closingTag)) {
            //     // System.out.print("Error 02 : " + openingTag + ", " + closingTag + "\n" + line + " : " + "None" + '\n');
            //     tempIndex++;
            //     testCases--;
            //     continue;
            // }
            // String t1 = line.replaceAll("(<[a-zA-Z\\d\\s]+>)+", "").replaceAll("(</[a-zA-Z\\d\\s]+>)+", "");
            // // System.out.println("match : " + t1);
        }
    }
}