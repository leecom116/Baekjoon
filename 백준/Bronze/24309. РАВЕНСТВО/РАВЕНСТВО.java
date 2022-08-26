import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger b1 = new BigInteger(br.readLine());
        BigInteger b2 = new BigInteger(br.readLine());
        BigInteger b3 = new BigInteger(br.readLine());

        System.out.println(b2.subtract(b3).divide(b1));
    }
}