// 입력 범위가 10의 1000제곱으로 거의 무한에 가까운 숫자를 사용한다.
// 숫자의 범위가 무한인 BigInteger를 이용한다.(문자열 형태로 이루어져 있다.)
import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();

        // 문자열 형태로 이루어져 있어 사칙연산이 안된다.
        // 따라서 클래스 내부의 함수를 이용한다.
        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));

        // 더하기 : a.add(b)
        // 뺄셈   : a.subtract(b)
        // 곱셈   : a.multiply(b)
        // 나눗셈 : a.divide(b)
        // 나머지 : a.remainder(b)
    }
}