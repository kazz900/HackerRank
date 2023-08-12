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

        // 사랑해 I love you ♥
        // 사랑한다 유미이 히힣힣
        // 바보 빠이
        //
        // Scanner in = new Scanner(System.in);
        // int testCases = Integer.parseInt(in.nextLine());
        int testCases = 4;
        int tempIndex = 0;
        while (testCases > 0) {
            String line = str[tempIndex].trim(); // ^[a-z] != bc
            Pattern pattern = Pattern.compile("(<[a-zA-Z\\d\\s]+>)+[\\w\\s\\d]+(</[a-zA-Z\\d\\s]+>)+");
            Matcher m1 = pattern.matcher(line);
            String HTML = "";
            String text = "";
            String openingTagStr = "";
            String closingTagStr = "";
            Pattern openingTagsPattern = Pattern.compile("(<[a-zA-Z\\d\\s]+>)+");
            Pattern closingTagsPattern = Pattern.compile("(</[a-zA-Z\\d\\s]+>)+");
            if (m1.find()) {
                HTML = m1.group();
            }
            m1 = pattern.matcher(HTML);
            Matcher openingTagMatcher = openingTagsPattern.matcher(HTML);
            Matcher closingTagMatcher = closingTagsPattern.matcher(HTML);
            if (HTML.isEmpty()) {
                System.out.println("3");
                break;
            }
            if (openingTagMatcher.find()) {
                System.out.println("4");
                openingTagStr = openingTagMatcher.group().replaceAll("[/<>]+", "").trim();
            } else {
                System.out.println("5");
                break;
            }
            if (closingTagMatcher.find()) {
                System.out.println("6");
                closingTagStr = closingTagMatcher.group().replaceAll("[/<>]+", "").trim();
            } else {
                System.out.println("7");
                break;
            }
            if (openingTagStr.length() != closingTagStr.length()) {
                System.out.println("None1");
                break;
            }
            if (!openingTagStr.equals(closingTagStr)) {
                System.out.println("None2");
                break;
            }
            Matcher finalChecMatcher = pattern.matcher(HTML);
            if (finalChecMatcher.find()) {
                text = HTML.replaceAll("(<[a-zA-Z\\d\\s]+>)+", "").replaceAll("(</[a-zA-Z\\d\\s]+>)+", "").trim();
                HTML = HTML.replaceAll("(<[a-zA-Z\\d\\s]+>)+", "").replaceAll("(</[a-zA-Z\\d\\s]+>)+", "").trim();
                System.out.println("text : " + text);
            } else {
                System.out.println("Final Check");
                break;
            }
            HTML = line.substring(HTML.length(), line.length()).trim();

            tempIndex++;
            testCases--;
        }
        // if (openingTag.length() != closingTag.length()) {
        // // System.out.print("Error 01 : " + openingTag + ", " + closingTag + "\n" +
        // line + " : " + "None" + "\n");
        // tempIndex++;
        // testCases--;
        // continue;
        // }
        // if (!openingTag.equals(closingTag)) {
        // // System.out.print("Error 02 : " + openingTag + ", " + closingTag + "\n" +
        // line + " : " + "None" + '\n');
        // tempIndex++;
        // testCases--;
        // continue;
        // }
        // String t1 = line.replaceAll("(<[a-zA-Z\\d\\s]+>)+",
        // "").replaceAll("(</[a-zA-Z\\d\\s]+>)+", "");
        // // System.out.println("match : " + t1);
    }
}
