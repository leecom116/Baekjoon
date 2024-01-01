import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int min = 0;

        for(int i=0; i<N; i++) {
            for(int j=0; j<i+1; j++) {
                min += arr[j];
            }
        }
        System.out.println(min);
    }
}