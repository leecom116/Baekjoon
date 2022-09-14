import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = new BigInteger(br.readLine(), 2);

        Stack<BigInteger> stack = new Stack<>();

        N = N.multiply(BigInteger.valueOf(17));

        while(true) {
            stack.push(N.remainder(BigInteger.valueOf(2)));
            N = N.divide(BigInteger.valueOf(2));
            if(N.equals(BigInteger.ONE)) {
                stack.push(N);
                break;
            }
        }
        while(!stack.isEmpty()) {
            BigInteger S = stack.pop();
            System.out.print(S);
        }
    }
}

