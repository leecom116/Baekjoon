import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         *  K: 랜선 개수
         *  N: 필요한 랜선 개수
         *
         *  N개를 만족하면서 랜선의 최대 길이를 구해야 하는 문제
         *  시간 복잡도를 줄이기 위해 이분 탐색 알고리즘 필요
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int K = Integer.parseInt(s[0]);
        int N = Integer.parseInt(s[1]);

        int[] arr = new int[K];

        long max = 0;

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if(max < arr[i]) {
                max = arr[i];
            }
        }

        max++;

        long min = 0;
        long mid = 0;

        while(min < max) {
            mid = (max + min) / 2;

            long count = 0;

            for(int i=0; i<arr.length; i++) {
                count += arr[i] / mid;
            }

            if(count < N) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}