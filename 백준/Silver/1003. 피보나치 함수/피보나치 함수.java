import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] zeroCount = new int[41];
    static int[] oneCount = new int[41];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        init();

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(zeroCount[N] + " " + oneCount[N]);
        }
    }

    /**
     * 2일 때, 0: 1, 1: 1
     * 3일 때, 0: 1, 1: 2
     * 4일 때, 0: 2, 1: 3
     * 5일 때, 0: 3, 1: 5
     */

    // 피보나치 배열의 각 0, 1 카운트 갯수를 배열에 저장
    static void init() {
        zeroCount[0] = 1;
        oneCount[1] = 1;

        for(int i=2; i<zeroCount.length; i++) {
            int newZero = zeroCount[i-1] + zeroCount[i-2];
            int newOne = oneCount[i-1] + oneCount[i-2];

            zeroCount[i] = newZero;
            oneCount[i] = newOne;
        }
    }
}