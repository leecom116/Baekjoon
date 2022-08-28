import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];


        for(int i=0; i<2; i++) {
            for(int j=0; j<5; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.print(arr[0]*6 + arr[1]*3 + arr[2]*2 + arr[3]*1 + arr[4]*2 + " ");
        }
    }
}