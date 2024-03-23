import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr;
    public static boolean[] visit;

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M]; // 임시 순열 값
        visit = new boolean[N]; // 노드 방문 여부
        dfs(N, M, 0);
        bw.flush();
        bw.close();
    }

    public static void dfs(int N, int M, int depth) throws IOException {
        if(depth == M) {
            for(int val : arr) {
                bw.write(val + " ");
            }
            bw.write("\n");
            return;
        }

        for(int i=0; i<N; i++) {
            if(! visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                visit[i] = false;
            }
        }
    }
}