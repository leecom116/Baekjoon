import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String b1 = br.readLine();
        String b2 = br.readLine();

        long lb1 = Long.parseLong(b1,2);
        long lb2 = Long.parseLong(b2,2);

        String num = Long.toBinaryString(lb1*lb2);

        System.out.println(num);
    }
}