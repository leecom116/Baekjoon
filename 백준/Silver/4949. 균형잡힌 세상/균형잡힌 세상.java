import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;

        while(true) {
            s = br.readLine();

            if(s.equals(".")) {
                break;
            }

            System.out.println(solve(s));
        }


    }

    public static String solve(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if(s.charAt(i) == ')') {
                if(stack.isEmpty() || stack.peek() != '(') {
                    return "no";
                } else {
                    stack.pop();
                }
            } else if(s.charAt(i) == ']') {
                if(stack.isEmpty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }

        if(stack.isEmpty()) {
            return "yes";
        } else {
            return "no";
        }

    }
}