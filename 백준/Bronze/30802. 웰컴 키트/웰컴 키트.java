import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.StringBuilder;


/**
 *  티셔츠는 부족하면 안 되고(남아도 됨), 펜은 정확히 나눠 떨어져야 됨
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        double[] arr = new double[6];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int result_t = 0;

        for(int i=0; i<arr.length; i++) {
            result_t += Math.ceil(arr[i] / T);
        }

        System.out.println(result_t);
        System.out.print(N / P + " " + N % P);
    }
}