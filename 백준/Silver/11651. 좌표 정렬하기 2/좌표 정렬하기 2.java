import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr[][] = new int[N][2];

        for(int i=0; i<N; i++) {
            arr[i][1] = sc.nextInt(); // y좌표
            arr[i][0] = sc.nextInt(); // x좌표
        }

        Arrays.sort(arr, (e1, e2) -> {
            // y좌표가 같으면
            if(e1[0] == e2[0]) {
                // x좌표가 증가하는 순서로 정렬
                return e1[1] - e2[1];
            } else {
                // y좌표가 증가하는 순서로 정렬
                return e1[0] - e2[0];
            }
        });

        for(int i=0; i<N; i++) {
            System.out.println(arr[i][1] + " " + arr[i][0]);
        }
    }
}