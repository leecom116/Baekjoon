import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];
        int count = 0;

        for(int i=0; i<7; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<4; i++) {
            if(arr[i]==arr[4]) {
                System.out.println(i + 1);
                count++;
            }
        }

        if(count==0) {
            System.out.println(0);
        }
    }
}