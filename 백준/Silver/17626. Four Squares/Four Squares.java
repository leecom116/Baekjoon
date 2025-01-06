import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int dp[] = new int[n + 1];

        dp[1] = 1;

        // 사용자가 입력한 값만큼 dp 시작
        for(int i=2; i<dp.length; i++) {
            dp[i] = dp[i-1];

            // 제곱근(j)가 i보다 작거나 같을 때
            for(int j=1; j*j<=i; j++) {
                dp[i] = Math.min(dp[i], dp[i - (j * j)]);
            }
            dp[i]++;
        }
        System.out.println(dp[n]);
    }
}