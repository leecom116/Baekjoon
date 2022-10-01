import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] ab = br.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);
        int c = Integer.parseInt(br.readLine());

        if((a+b)>=(c*2)) {
            System.out.println((a+b)-(c*2));
        } else {
            System.out.println(a+b);
        }

    }
}