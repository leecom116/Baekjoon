import java.beans.BeanInfo;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger sum;

        int T = sc.nextInt();

        for(int i=0; i<T; i++) {
            sum = new BigInteger("0");
            sc.nextLine();

            long N = sc.nextInt();

            for(int j=0; j<N; j++) {
                
                sum = sum.add(sc.nextBigInteger());

            }

            if(sum.remainder(BigInteger.valueOf(N)).intValue() == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}