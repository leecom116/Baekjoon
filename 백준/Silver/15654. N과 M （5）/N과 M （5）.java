import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

public class Main {

    public static int N, M;
    public static int[] arr, num;
    public static boolean[] visited;
    public static StringTokenizer st;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());

         N = Integer.parseInt(st.nextToken());
         M = Integer.parseInt(st.nextToken());
         // 사용할 숫자 배열
         num = new int[N];

         // 임시 수열을 저장할 배열
         arr = new int[M];

         // 중복 제거 판단을 위한 배열
         visited = new boolean[N];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<num.length; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        dfs(0);

        System.out.println(sb);
    }

    public static void dfs(int depth) {

        if(depth == M) {
            for(int item : arr) {
                sb.append(item + " ");
            }
            sb.append("\n");

            return;
        }

        for(int i=0; i<N; i++) {

            if(! visited[i]) {
                visited[i] = true;

                arr[depth] = num[i];
                dfs(depth + 1);

                visited[i] = false;
            }
        }
    }
}