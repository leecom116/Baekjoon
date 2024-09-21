import java.util.Scanner;

public class Main {

    static int[] dp = new int[11];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i=4; i<dp.length; i++) {
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        int T = sc.nextInt();

        for(int i=0; i<T; i++) {
            System.out.println(dp[sc.nextInt()]);
        }
    }
}