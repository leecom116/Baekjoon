import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<3; i++) {

            int N = Integer.parseInt(br.readLine());

            BigInteger sum = new BigInteger("0");
            for(int j=0; j<N; j++) {
                // BigInteger 객체 생성할 때 인자는 String의 형태가 들어가야 한다.

                BigInteger bi = new BigInteger(br.readLine());

                sum = sum.add(bi);
            }

            // compareTo(0) 반환값
            // 음수일 경우 : -1, 양수일 경우 : 1, 0일 경우 0
            if(sum.compareTo(BigInteger.ZERO) == 0) {
                System.out.println("0");
            } else if(sum.compareTo(BigInteger.ZERO) > 0) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }

        }
    }
}