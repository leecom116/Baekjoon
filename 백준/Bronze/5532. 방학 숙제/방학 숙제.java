import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt(); // 방학 기간
        int A = sc.nextInt(); // 국어 총 페이지 수
        int B = sc.nextInt(); // 수학 총 페이지 수
        int C = sc.nextInt(); // 하루에 풀 수 있는 최대 페이지 수(국어)
        int D = sc.nextInt(); // 하루에 풀 수 있는 최대 페이지 수(수학)

        for(int i=1; ; i++) {
            if(i*C >= A && i*D >= B) {
                System.out.println(L-i);
                break;
            }
        }

    }
}