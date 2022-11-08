import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static boolean[][] arr;
    public static int min = 64; // 8*8 최솟값

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        for(int i=0; i<N; i++) {

            String s = br.readLine();

            for(int j=0; j<M; j++) {
                if(s.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        // 체스판을 놓을 수 있는 경우의 수 찾기
        int N_row = N - 7;
        int M_col = M - 7;

        for(int i=0; i<N_row; i++) {
            for(int j=0; j<M_col; j++) {
                search(i, j);
            }
        }

        System.out.println(min);
    }
    /*
        경우의 수에 해당하는 좌표 번호를 입력 받아
        그 좌표안에서 8x8 체스판을 만들려면 필요한 count수를 각각 찾아 최솟값을 찾는다.

     */
    public static void search(int x, int y) {
        int end_x = x+8;
        int end_y = y+8;
        int count = 0;

        boolean first = arr[x][y];

        for(int i=x; i<end_x; i++) {
            for(int j=y; j<end_y; j++) {
                if(arr[i][j] != first) { // 체스판 패턴과 맞지 않은 색일 경우
                    count++;
                }
                // 다음 색상은 반대
                first = !first;
            }

            // 다음 줄로 넘어갈때마다
            first = !first;

        }

        // 첫번째 칸이 흰색 또는 검은색일 경우의 수 2가지중에 최솟값
        count = Math.min(count, 64-count);

        // min에 저장되어 있는 최솟값과 현재 count 값 비교
        min = Math.min(min, count);
    }
}