import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(), k, n;
        int[][] arr = new int[15][15]; // 1 ≤ k, n ≤ 14

        for(int i=0; i<arr.length; i++) {      // arr 행의 개수만큼 반복

            arr[i][1] = 1;      // 각 층에 1호는 1명으로 고정
            arr[0][i] = i;      // 0층에 각 i호는 i명의 사람이 살고 있음

        }

        for(int i=1; i<15; i++) {
            for(int j=2; j<15; j++) {
            // arr[1][2] 부터 숫자를 저장
             arr[i][j] = arr[i][j-1] + arr[i-1][j]; // ex) arr[1][2](==3) = arr[1][1](==1) + arr[0][2](==2)

            }
        }

        for(int i=0; i<T; i++) { // 테스트 케이스의 개수만큼 반복

            k = sc.nextInt(); // k층
            n = sc.nextInt(); // n호

            System.out.println(arr[k][n]);

        }
    }
}
