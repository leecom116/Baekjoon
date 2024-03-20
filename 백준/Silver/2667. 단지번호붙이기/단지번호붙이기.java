import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static int N;
    static int[][] arr;
    static boolean[][] visited;
    static List<Integer> result;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int each = 0;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        visited = new boolean[N][N];
        result = new ArrayList<>();

        for(int j=0; j<N; j++) {
            String s = br.readLine();
            for(int i=0; i<s.length(); i++) {
                arr[j][i] = Character.getNumericValue(s.charAt(i));
            }
        }

        for(int j=0; j<N; j++) {
            for(int i=0; i<N; i++) {
                if(arr[j][i] == 1 && visited[j][i] == false) {
                    visited[j][i] = true;
                    each = 0;
                    dfs(j, i);
                    result.add(each);

                }
            }
        }
        Collections.sort(result);

        bw.write(result.size() + "\n");
        for(int r : result) bw.write(r + "\n");
        bw.flush();
        bw.close();
    }

    static void dfs(int y, int x) {
        for(int k=0; k<4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            if(nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if(arr[ny][nx] == 1 && ! visited[ny][nx]) {
                    visited[ny][nx] = true;
                    dfs(ny, nx);
                }
            }
        }
        each++;
    }
}