import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();
        int N = sc.nextInt();

        long a = 0;
        long b = 0;

        if(R % N != 0) {
            a += R / N + 1;
        } else {
            a += R / N;
        }

        if(C % N != 0) {
            b += C / N + 1;
        } else {
            b += C / N;
        }

        System.out.println(a*b);
    }
}