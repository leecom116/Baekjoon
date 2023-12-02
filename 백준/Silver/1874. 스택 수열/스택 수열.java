import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int start = 0;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());

            while(start < num) {
                stack.push(++start);
                sb.append("+\n");
            }

            if(stack.pop() == num) {
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }

        }
        System.out.println(sb);
    }
}