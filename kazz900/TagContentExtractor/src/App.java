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
                "<SA premium>Imtiaz has a secret crush</SA premium>",
                "<h1>some</h1>",
"<h1>had<h1>public</h1></h1>",
"<h1>had<h1>public</h1515></h1>",
"<h1><h1></h1></h1>",
"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<",
">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>",
"<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>",
"<>hello</>",
"<>hello</><h>dim</h>",
"<>hello</><h>dim</h>>>>>",
new String("qqoNVOmJDG@6IBDZoEmk9337LswEL&TQnLCuR`04XD%1t{G)Jmi_iNEXKwp&<iBKMbDGtF4v@coLsF1_LqgTJ3cSp& 3a~I&Q(j0h_w~Vk(oBZCL#vhYY9%c><wkjkTvAuA8Zk}n_l7Si"+"-pfm`M8YE3F}4`YQyChgC3uRbyTvu>bMUGux)5n7L={M}e^`0xlSm5ce}ehiE}CJ6y0KPd~~B~ak5$PTdPGv}QnXpw6n9V8wVCVaTRTgLKkeF</wkjkTvAuA8Zk}n_l7Si"+"-pfm`M8YE3F}4`YQyChgC3uRbyTvu>haZQKlWPxlRqXXkKHo=FDofc6$_S-GWA&m0zT*D~uorf_nAF^ym*U&6hGAI)s<XshvNhnnNbeVDuxRcQAgTpWZ-kqIps-@@}Uwq0J3Z06Y5mZgB9><FbTSC#F104{py9Xl6s{yi-R~}k5Fv4i1kCgmBY7P=vVj-j48xUg8x9BCxl~Y><lyxRRMqnMBGj1_d7Qqh5Ebn7 aMb{Q0Dm){9~I0DTS8BZ7+bui~)rQ"+"2Yb4f>EeZWvJvHIk</XshvNhnnNbeVDuxRcQAgTpWZ-kqIps-@@}Uwq0J3Z06Y5mZgB9><BkkZV631Pnj}#%TWhZn@Y><kXjDpTvLA^tnXYb`h+cA J2"),
new String("wRhDGQCG`r N4=cWqp4jF"#I7#)jofKUYktmjH("s2nD4+NxsN)tpCf2U@78MsGNbEgSgR=6`"y685~I(D-p&T2BnaJNa%S%y9pYMb_9v{PlScQ7R=~~xnSkpSd<orcsjzalN#eslhhH2d"1MD)pzc*$tBG-mmI_*zW><xMphtS-F8MVM^u2n5tN2DthGw{KZ`y7)><ZpjQU2&UMjzwJwnV70-CiM}M-OvR%a)Vk3R}2><DqcnlvJJa7ZYYrX^M*BI^*A_-mm0 HT4i^syNtujpEE8M@><mpX{FWXe#$d`)QdqT#eBbH=EJOXc@cFhxpJg14#*G0 o-w9G++`GA9U><PbwFCKiY2D^jhX_l7fM}tsB6QKv{-truncated-}"
)
        };
        // Scanner in = new Scanner(System.in);
        // int testCases = Integer.parseInt(in.nextLine());
        String HTML = "";
        String subStr = "";
        String openingTagStr = "";
        String closingTagStr = "";
        Pattern pattern = Pattern.compile("((<[a-zA-Z\\d\\w\\s]+>)+([\\w\\s\\d]+)+(<[a-zA-Z\\d\\w\\s]+>)+([\\w\\s\\d]+)+(</[a-zA-Z\\d\\s]+>)+)|((<[a-zA-Z\\d\\s]+>)+[\\w\\s\\d]+(</[a-zA-Z\\d\\s]+>)+)");
        Pattern openingTagsPattern = Pattern.compile("((<[a-zA-Z\\d\\s]+>)+)|(<[a-zA-Z\\d\\s]+>)+([\\w\\d\\s]+)+(<[a-zA-Z\\d\\s]+>)+");
        Pattern closingTagsPattern = Pattern.compile("(</[a-zA-Z\\d\\s]+>)+|(</[a-zA-Z\\d\\s]+>)+([\\w\\d\\s]+)+(</[a-zA-Z\\d\\s]+>)+");
        int testCases = 4;
        int tempIndex = 0;
        while (testCases > 0) {
            String line = str[tempIndex].trim(); // ^[a-z] != bc
            Matcher m1 = pattern.matcher(line);
            while (m1.find()) {
                HTML = m1.group();
                Matcher openingTagMatcher = openingTagsPattern.matcher(HTML);
                Matcher closingTagMatcher = closingTagsPattern.matcher(HTML);
                if (openingTagMatcher.find()) {
                    openingTagStr = openingTagMatcher.group().replaceAll("[/<>]+", "").trim();
                }
                if (closingTagMatcher.find()) {
                    closingTagStr = closingTagMatcher.group().replaceAll("[/<>]+", "").trim();
                }
                if (openingTagStr.length() != closingTagStr.length()) {
                    System.out.println("None");
                    break;
                }
                if (!openingTagStr.equals(closingTagStr)) {
                    System.out.println("None");
                    break;
                }
                subStr = line.substring(HTML.length(), line.length());
                HTML = HTML.replaceAll("((<[a-zA-Z\\d\\s]+>)+)|(<[a-zA-Z\\d\\s]+>)+([\\w\\\\d\\\\s]+)+(<[a-zA-Z\\\\d\\\\s]+>)+", "").replaceAll("(</[a-zA-Z\\d\\s]+>)+", "").trim();
                System.out.println(HTML);
                // System.out.println("substr : " + subStr);
                m1 = pattern.matcher(subStr);
                if (!subStr.isEmpty() && m1.find()) {
                    subStr = subStr.replaceAll("(<[a-zA-Z\\d\\s]+>)+", "").replaceAll("(</[a-zA-Z\\d\\s]+>)+", "").trim();
                    System.out.println(subStr);
                }
            }
            tempIndex++;
            testCases--;
        }
    }
}
