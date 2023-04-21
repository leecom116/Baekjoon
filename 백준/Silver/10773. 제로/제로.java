import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        long sum = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<K; i++) {

            int input = sc.nextInt();

            if(input == 0) {
                stack.pop();
            } else {
                stack.push(input);
            }
        }

        for(int i=0; i<stack.size(); i++) {
            sum += stack.get(i);
        }

        System.out.println(sum);

    }
}