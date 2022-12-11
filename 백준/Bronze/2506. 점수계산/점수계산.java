import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int sum = 0;
        int plus = 0;

        while(st.hasMoreTokens()) {
            if(st.nextToken().equals("1")) {
                plus++;
                sum += plus;
            } else {
                plus = 0;
            }
        }

        System.out.println(sum);
    }
}