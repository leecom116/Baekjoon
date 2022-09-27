import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];

        for(int i=0; i<4; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b) {
            System.out.println(arr[1]+arr[2]+arr[3]+a);
        } else {
            System.out.println(arr[1]+arr[2]+arr[3]+b);
        }

    }
}