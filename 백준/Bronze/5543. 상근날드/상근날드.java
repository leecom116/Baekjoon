import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int d = sc.nextInt();
        int e = sc.nextInt();


        if(d>e) {
            System.out.println(arr[0]+e-50);
        } else {
            System.out.println(arr[0]+d-50);
        }
    }
}