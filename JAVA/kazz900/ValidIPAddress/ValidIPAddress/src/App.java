import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // String[] str = new String[] {
        //         "000.12.12.034",
        //         "121.234.12.12",
        //         "23.45.12.56",
        //         "00.12.123.123123.123",
        //         "122.23",
        //         "Hello.IP",
        //         "12.12.12.12",
        //         "13.13.13.112",
        //         "VUUT.12.12",
        //         "111.111.11.111",
        //         "1.1.1.1.1.1.1",
        //         ".....",
        //         "1...1..1..1",
        //         "0.0.0.0",
        //         "255.0.255.0",
        //         "266.266.266.266",
        //         "00000.000000.0000000.00001",
        //         "0023.0012.0012.0034",
        //         "259.259.259.259",
        //         "266.266.266.266",
        //         "255.255.255.255",
        //         "555.555.555.555",
        //         "666.666.666.666",
        //         "249.249.249.249",
        //         "249.249.249.256"
        // };

        // String[] trueFalse = new String[] {
        //         "true",
        //         "true",
        //         "true",
        //         "false",
        //         "false",
        //         "false",
        //         "true",
        //         "true",
        //         "false",
        //         "true",
        //         "false",
        //         "false",
        //         "false",
        //         "true",
        //         "true",
        //         "false",
        //         "false",
        //         "false",
        //         "false",
        //         "false",
        //         "true",
        //         "false",
        //         "false",
        //         "true",
        //         "false"
        // };

        // String pattern = "([0-2]?[0-5]{1,2})(\\.)?([0-2]?[0-5]{1,2})(\\.)?([0-2]?[0-5]{1,2})(\\.)?([0-2]?[0-5]{1,2})";

        // for (int i = 0; i < str.length; i++) {
        //     String IP = str[i];
        //     if(IP.matches(pattern)) System.out.println(str[i] + " : true");
        //     else System.out.println(str[i] + " : false");
        // }
        ArrayList<String> names = new ArrayList<String>();
        names.add("김화범 조장");
        names.add("홍성철");
        names.add("최유미");
        names.add("최준우");
        names.add("최승준");
        names.add("장민지");
        names.sort((String s1, String s2) -> s1.compareTo(s2));
        
        names.forEach((s)-> System.out.println(s));
    }
}
