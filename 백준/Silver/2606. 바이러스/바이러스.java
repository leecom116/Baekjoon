import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // 방문 여부 체크
    static boolean[] check;

    // 컴퓨터 관계
    static int[][] arr;

    // 컴퓨터의 수
    static int node;

    // 바이러스에 걸린 컴퓨터의 수
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        // 컴퓨터의 수
        node = Integer.parseInt(br.readLine());

        // 배열 인덱스는 0부터 시작하므로, 실제 넘버와 맞추기 위해 +1
        check = new boolean[node+1];
        arr = new int[node+1][node+1];

        // 간선의 개수
        int line = Integer.parseInt(br.readLine());

        // 연결된 컴퓨터 쌍의 수
        for(int i=0; i<line; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 노드 간의 간선 연결 여부 처리
            arr[a][b] = arr[b][a] = 1;
        }

        dfs(1);

        // 1번 컴퓨터를 제외한 감염된 컴퓨터의 수
        System.out.println(count - 1);
    }

    static void dfs(int start) {
        /**
         * 시작 노드(1) 부터 시작하여,
         * 재귀 함수 실행하여 쭉 이어진 노드 탐색(DFS)
         */

        check[start] = true;
        count++;

        for(int i=0; i<=node; i++) {
            // 이전(시작) 노드와 연결된 간선이고, 처음 방문하는 노드인 경우
            if(arr[start][i] == 1 && ! check[i])
                dfs(i);
        }
    }

}