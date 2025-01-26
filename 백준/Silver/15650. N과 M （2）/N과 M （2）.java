import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {

    public static int N, M;

    public static int[] arr;

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];

        dfs(1, 0);
        System.out.println(sb);
    }

    public static void dfs(int first, int depth) {
        // 깊이가 M이랑 동일할 경우, 저장 후 종료
        if(depth == M) {
            for(int item : arr) {
                sb.append(item).append(" ");
            }
            sb.append("\n");
            return;
        }

        // N개 만큼 반복
        for(int i=first; i<=N; i++) {
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }

    }
}