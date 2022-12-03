
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int N_i = 0, N_j = 0, col = 0;
        int M_i = 0, M_j = 0, row = 0;


        int[][] arr = new int[4][3500000];


        for(int i=0; i<4; i++) {
            for(int j=0; j<=3000000; j++) {
                arr[i][j] = (i+1) + (j*4);

                if(arr[i][j] == N) {
                    N_i = i;
                    N_j = j;
                }
                if(arr[i][j] == M) {
                    M_i = i;
                    M_j = j;
                }
            }
        }

        if(N_i > M_i) {
            col = (N_i - M_i);
        } else {
            col = (M_i - N_i);
        }

        if(N_j > M_j) {
            row = (N_j - M_j);
        } else {
            row = (M_j - N_j);
        }

        System.out.println(row + col);

    }
}