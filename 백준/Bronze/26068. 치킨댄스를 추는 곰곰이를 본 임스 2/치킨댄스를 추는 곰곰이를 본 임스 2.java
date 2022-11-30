import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=0; i<N; i++) {
            int gift = Integer.parseInt(br.readLine().substring(2));

            if(gift <= 90) {
                count++;
            }
        }

        System.out.println(count);
    }
}