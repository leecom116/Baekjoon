import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.util.Arrays;

public class Main {

    public static StringTokenizer st;

    public static int N, M;

    public static boolean[] visited;

    // 제시된 숫자들
    public static int[] nums;

    // 임시 수열 저장
    public static int[] arr;

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        nums = new int[N];
        visited = new boolean[N];
        arr  = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

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

        int before = 0;

        for(int i=0; i<N; i++) {
            if(visited[i])
                continue;

            // 전체 숫자중에서 하나의 숫자 기준으로 순회할 때, 중복 숫자 값을 제외
            if(before != nums[i]) {
                visited[i] = true;

                arr[depth] = nums[i];
                before = nums[i];

                dfs(depth + 1);

                visited[i] = false;
            }


        }

    }
}