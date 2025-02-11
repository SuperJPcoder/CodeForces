import java.util.*;

public class Main {
    public static void cost(String str) {
        Stack<Integer> stack = new Stack<>();
        int totalCost = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')' && !stack.isEmpty()) {
                int openIndex = stack.pop();
                totalCost += (i - openIndex);
            }
        }
        
        System.out.println(totalCost);
    }

    public static String makeValidBracketSequence(String s) {
        int openNeeded = 0;
        int closeNeeded = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                openNeeded++;
            } else if (ch == ')') {
                if (openNeeded > 0) {
                    openNeeded--;
                } else {
                    closeNeeded++;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '_') {
                if (closeNeeded > 0) {
                    result.append('(');
                    closeNeeded--;
                } else {
                    result.append(')');
                    openNeeded--;
                }
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            String s = sc.next();

            

            for (int i = l - 1; i >= 2; i -= 2) {
                if (s.charAt(i) == ')') {
                    if (s.charAt(i - 2) == ')') {
                        s = s.substring(0, i - 1) + '(' + s.substring(i, l);
                    } else {
                        s = s.substring(0, i - 1) + ')' + s.substring(i, l);
                    }
                }
            }
            s = '(' + s.substring(1, l);
            // Fill underscores to make the string a valid bracket sequence
            s = makeValidBracketSequence(s);
            cost(s);
        }
    }
}
