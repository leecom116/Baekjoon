import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a == b && b == c) {
                arr[i] = 10000 + a * 1000;
            } else if(a == b || b == c) {
                arr[i] = 1000 + b * 100;
            } else if(a == c) {
                arr[i] = 1000 + a * 100;
            } else {
                int tempMax = Math.max(a,b);
                int max = Math.max(tempMax, c);

                arr[i] = max * 100;
            }
        }

        Arrays.sort(arr);
        System.out.println(arr[N-1]);
    }
}