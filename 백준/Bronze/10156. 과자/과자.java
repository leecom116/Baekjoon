import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt(); // 과자 한 개의 가격
        int N = sc.nextInt(); // 사려고 하는 과자의 개수
        int M = sc.nextInt(); // 현재 동수가 가진 돈

            if( K*N > M) {
                System.out.println((K*N)-M);
        } else {
                System.out.println(0);
            }


    }
}