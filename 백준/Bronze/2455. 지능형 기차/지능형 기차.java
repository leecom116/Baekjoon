import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer sb;
        int max = 0;
        int[] arr = new int[4];

        for(int i=0; i<4; i++) {
            sb = new StringTokenizer(br.readLine(), " ");

            int out = Integer.parseInt(sb.nextToken());
            int in  = Integer.parseInt(sb.nextToken());

            // 기차에서 내릴때
            max -= out;

            // 기차를 탈때
            max += in;

            arr[i] = max;
        }

        Arrays.sort(arr);
        System.out.println(arr[3]);
    }
}