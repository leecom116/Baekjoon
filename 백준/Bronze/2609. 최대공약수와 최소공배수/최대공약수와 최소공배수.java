import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 최대 공약수와 최소 공배수 출력하는 프로그램

        int a = sc.nextInt(), b = sc.nextInt();
        int i = a < b ? a : b;

        while(i > 0) {
            if(a % i == 0 && b % i == 0) {
                System.out.println(i);
                System.out.println((a / i) * (b / i) * i);
                break;
            }
            i--;
        }

    }
}
