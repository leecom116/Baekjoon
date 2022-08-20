import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];

        for(int i=0; i<6; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println((arr[3]-arr[2])+" "+(arr[4]/arr[1])+" "+(arr[5]-arr[0]));
    }
}