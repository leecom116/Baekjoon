import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 25965번 미션 도네이션
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 총 게임의 수

        for(int i=0; i<N; i++) {

            int M = sc.nextInt(); // 총 미션의 수
            long[][] arr = new long[M][3];
            long sum = 0;

            for(int j=0; j<M; j++) {
                arr[j][0] = sc.nextLong();
                arr[j][1] = sc.nextLong();
                arr[j][2] = sc.nextLong();
            }

            int k = sc.nextInt();
            int d = sc.nextInt();
            int a = sc.nextInt();

            for(int j=0; j<M; j++) {

                if(arr[j][0]*k - arr[j][1]*d + arr[j][2]*a < 0) {
                    sum += 0;
                } else {
                    sum += (arr[j][0]*k - arr[j][1]*d + arr[j][2]*a);
                }

            }

            System.out.println(sum);
        }

    }
}