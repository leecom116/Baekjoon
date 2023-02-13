import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {

            String s = br.readLine();

            String result = check(s);

            System.out.println(result);

        }
    }

    public static String check(String s) {

        Stack<Character> stack = new Stack<>();

        for(int j=0; j<s.length(); j++) {


            if(s.charAt(j) == '(') {
                stack.push('(');
            } // '(' 이 아니라 빈 스택에 ')'를 넣을 경우
            else if(stack.isEmpty()) {
                return "NO";
            } // ')' 일 경우
            else {
                stack.pop();
            }
        }

        if(stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}