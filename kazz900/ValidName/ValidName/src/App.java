import java.util.Scanner;
import java.util.Stack;

public class App {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String[] arr = new String[] {
                "{}()",
                "({()})",
                "{}(",
                "[]"
        };
        String t = "";
        char c1 = '*';
        char c2 = '*';
        int firstIndex = 0;
        int lastIndex = 0;
        Stack<String> stack = new Stack<String>();
        boolean isCorrect = false;
        // while (sc.hasNext()) {
        // String input = sc.next();
        // // Complete the code
        // while (sc.hasNext()) {
        // s.add(input);
        // }
        for (int i = 0; i < arr.length; i++) {
            stack.add(arr[i]);
        }
        // {([])}

        while (!stack.isEmpty()) {
            t = stack.pop();

            firstIndex = 0;
            lastIndex = t.length() - 1;

            if (t.length() % 2 != 0) {
                isCorrect = false;
                System.out.println(isCorrect);
                continue;
            }

            c1 = t.charAt(firstIndex);
            c2 = t.charAt(lastIndex);

            if (t.length() == 2) {
                if (c1 == '{') {
                    if (c2 == '}' || t.contains("}")) {
                        isCorrect = true;
                        System.out.println(isCorrect);
                        continue;
                    }
                } else if (c1 == '(') {
                    if (c2 == ')' || t.contains(")")) {
                        isCorrect = true;
                        System.out.println(isCorrect);
                        continue;
                    }
                } else if (c1 == '[') {
                    if (c2 == ']' || t.contains("]")) {
                        isCorrect = true;
                        System.out.println(isCorrect);
                        continue;
                    }
                }
            }

            firstIndex++;
            lastIndex--;

            for (int i = 0; i < t.length(); i++) {
                c1 = t.charAt(firstIndex);
                for (int j = 0; j < t.length(); j++) {
                    c2 = t.charAt(lastIndex);
                    
                    if (c1 == '(') {
                        if (c2 == ')' || t.contains(")")) {
                            isCorrect = true;
                        } else {
                            isCorrect = false;
                        }
                    } else if (c1 == '{') {
                        if (c2 == '}' || t.contains("}")) {
                            isCorrect = true;
                        } else {
                            isCorrect = false;
                        }
                    } else if (c1 == '[') {
                        if (c2 == '}' || t.contains("}")) {
                            isCorrect = true;
                        } else {
                            isCorrect = false;
                        }
                    }
                    if(lastIndex <= 0){
                        break;
                    }
                    lastIndex--;
                }
                if(firstIndex >= t.length() - 1){
                    break;
                }
                firstIndex++;
            }
            System.out.println(isCorrect);
        }
    }
}
