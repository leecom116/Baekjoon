import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];
        int sum = 0;
        int min = 100;

        for(int i=0; i<7; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<7; i++) {
            if(arr[i] % 2 == 1) {
                sum += arr[i];

                if(arr[i] < min) {
                    min = arr[i];
                }
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}