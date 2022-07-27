import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 이항 계수 구하기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();
        // N! / ((N-K)! * K!)
        // 5! / (3! * 2!)

        System.out.println(Factorial(N) / (Factorial(N-K) * Factorial(K)));

    }


    public static int Factorial(int a) {
        // 재귀함수 이용하기

        if(a <= 1) {
            return 1;
        }

        return a * Factorial(a-1);
    }

}

