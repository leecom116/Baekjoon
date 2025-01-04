import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    // 배열 인덱스에 해당하는 계단 점수 최대값
    static Integer[] dp;

    // 입력한 계단 점수 저장
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp = new Integer[N+1];
        arr = new int[N+1];

        for(int i=1; i<=N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 0으로 초기화
        dp[0] = arr[0];
        dp[1] = arr[1];

        if(N >= 2)
            dp[2] = arr[1] + arr[2];

        // 재귀 함수 호출
        System.out.println(getMaxScore(N));
    }

    // 작은 계단층들의 최댓값들을 구해나가면서, 최종 계단 층에 해당하는 최대값 반환
    static int getMaxScore(int N) {

        if(dp[N] == null) {
            // 연속해서 3계단을 밟는 경우 제외
            // ex) N이 10일 경우, 8층에서 10층으로 가는 케이스와
            //     7층에서 9층, 10층 가는 케이스 두 가지의 경우가 존재함
            dp[N] = Math.max(getMaxScore(N-2), getMaxScore(N-3) + arr[N-1]) + arr[N];
        }
        return dp[N];
    }
}