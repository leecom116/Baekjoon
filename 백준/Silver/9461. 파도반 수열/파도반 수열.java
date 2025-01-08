import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

    static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());

            dp = new long[101];

            recur();

            System.out.println(dp[n]);
        }
    }

    static void recur() {
        dp[1] = 1; dp[2] = 1; dp[3] = 1; dp[4] = 2; dp[5] = 2;

        for(int i=6; i<dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-5];
        }
    }
}