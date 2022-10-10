import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        /*
         M  :  앞면이 O인 개수 K : 뒷면이 O인 개수
         N-M : 앞면이 X인 개수 N-K : 뒷면이 X인 개수
         앞면과 뒷면 둘중 최솟값이 같은 모양이 적혀있는 카드의 최대 개수를 출력할 수 있다.
         */
        System.out.println(Math.min(M,K) + Math.min(N-M,N-K));
    }
}