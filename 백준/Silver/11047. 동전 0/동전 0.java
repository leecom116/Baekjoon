import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i=N-1; i>=0; i--) {
            int kk = K / arr[i];
            if(kk > 0) {
                K = K % arr[i];
                count += kk;
            }
        }
        System.out.println(count);
    }
}