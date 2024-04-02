import java.util.Scanner;

/**
 *  1.아이디어
 *
 *
 * 2. 시간복잡도
 * 10,000,000,000
 *
 * 3. 자료구조
 *
 *
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        long max = Long.MIN_VALUE;
        int k = 0;
        long val = 0;

        for(int i=0; i<N; i++) {
            k++;
            val += arr[i];
            if(k > K) {
                val -= arr[i-K];
                if(val > max) {
                    max = val;
                }
            } else if(k == K) {
                max = val;
            }
        }
        System.out.println(max);
    }
}