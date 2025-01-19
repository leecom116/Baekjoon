import java.io.*;
import java.util.*;

public class Main {

    static int[][] arr;
    static boolean[][] check;

    static int M, N;

    static int count;

    static int[] dx = new int[]{0, 1, 0, -1};
    static int[] dy = new int[]{1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            arr = new int[N][M];
            check = new boolean[N][M];
            count = 0;

            for(int j=0; j<K; j++) {
                st = new StringTokenizer(br.readLine());

                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());

                arr[Y][X] = 1;
            }

            for(int j=0; j<N; j++) {
                for(int k=0; k<M; k++) {
                    // 배추가 존재하고 탐색을 한 적이 없을 경우, DFS 탐색
                    if(arr[j][k] == 1 && ! check[j][k]) {
                        count++;

                        dfs(k, j);
                    }
                }
            }

            System.out.println(count);
        }
    }

    static void dfs(int x, int y) {
        check[y][x] = true;

        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 배추밭 범위 안이고, 이전에 방문 안한 배추일 경우 dfs 재귀 실행
            if((nx>=0 && nx<M && ny>=0 && ny<N)
                    && arr[ny][nx] == 1 && ! check[ny][nx]) {
                dfs(nx,ny);
            }
        }
    }
}