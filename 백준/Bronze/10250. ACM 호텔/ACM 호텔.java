import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스의 개수 설정

        int a, b; // a : 층, b : 호 수


        for(int i=0; i<T; i++) { // T만큼 반복

            int H = sc.nextInt(); // ex) 6
            int W = sc.nextInt(); // ex) 12
            int N = sc.nextInt(); // ex) 10

            if(N % H == 0) { // 꼭대기 층 예외 처리
                a = H * 100; 
                b = N / H;   
            }
            else {
                a = (N % H) * 100;
                b = (N / H) + 1;
            }

            System.out.println(a+b);
        }

    }
}
