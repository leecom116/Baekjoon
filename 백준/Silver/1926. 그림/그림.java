import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] arr;
    static boolean[][] visit;
    static int[] dx;
    static int[] dy;
    static Queue<Pair> qu;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visit = new boolean[n][m];

        dx = new int[]{1, 0, -1, 0};
        dy = new int[]{0, 1, 0, -1};

        qu = new LinkedList<>();

        // 배열값 세팅
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 구현 시작
        int count = 0;
        int area = 0;
        int max = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                // 0이거나 방문한 적이 있으면 생략
                if(arr[i][j] == 0 || visit[i][j]) {
                    continue; // 반복문 스킵
                }
                count++;
                qu.offer(new Pair(i,j));
                visit[i][j] = true;
                area = 0;

                while(!qu.isEmpty()) {
                    Pair p = qu.poll();
                    area++;

                    for(int k=0; k<4; k++) {
                        int n_x = p.x + dx[k];
                        int n_y = p.y + dy[k];

                        // 좌표 이동후 영역 범위를 벗어나는 경우
                        if(n_x < 0 || n_x >= n || n_y < 0 || n_y >= m) {
                            continue;
                        }

                        // 그림 영역 확장
                        if(arr[n_x][n_y] == 1 && !visit[n_x][n_y]) {
                            qu.offer(new Pair(n_x, n_y));
                            visit[n_x][n_y] = true;
                        }
                    }
                }

                if(area > max) {
                    max = area;
                }
            }
        }

        System.out.println(count);
        System.out.println(max);
    }

    public static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}