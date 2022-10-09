import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String N = st.nextToken();
        String M = st.nextToken();

        if(N.equals(M)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}