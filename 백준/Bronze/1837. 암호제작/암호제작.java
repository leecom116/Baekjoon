import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        BigInteger P = new BigInteger(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 두 소수 p, q 중 하나라도 K보다 작은 암호 : BAD
        for(int i=2; i<K; i++) {
            if(P.remainder(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                System.out.println("BAD " + i);
                System.exit(0);
            }
        }
            System.out.println("GOOD");
    }
}