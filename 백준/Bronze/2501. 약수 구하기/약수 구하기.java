import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int n = 0;

        int[] arr = new int[N];

        for(int i=1; i<=N; i++) {
            if(N % i == 0) {
                arr[n++] = i;
            }
        }

        if(arr[K-1] == 0) {
            System.out.println(0);
        } else {
            System.out.println(arr[K-1]);
        }

    }
}