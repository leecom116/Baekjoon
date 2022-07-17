import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(), k, n;
        int[][] arr = new int[15][15];

        for(int i=0; i<arr.length; i++) {

            arr[i][1] = 1;
            arr[0][i] = i;

        }

        for(int i=1; i<15; i++) {
            for(int j=2; j<15; j++) {

             arr[i][j] = arr[i][j-1] + arr[i-1][j];

            }
        }

        for(int i=0; i<T; i++) {

            k = sc.nextInt();
            n = sc.nextInt();

            System.out.println(arr[k][n]);

        }
    }
}