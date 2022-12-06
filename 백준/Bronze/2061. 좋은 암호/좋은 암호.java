import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        BigInteger K = new BigInteger(s);
        int L = sc.nextInt();
        BigInteger min = new BigInteger("0");



        for(int i=2; i<L; i++) {

            if(K.remainder(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO) == 0) {
                // L보다 작은 수에서 나누어 떨어지므로 나쁜 암호
                min = BigInteger.valueOf(i);
                break;
            }
        }


        if(min.compareTo(BigInteger.ZERO) == 0) {
            System.out.println("GOOD");
        } else {
            System.out.println("BAD " + min);
        }
        
        
    }
}