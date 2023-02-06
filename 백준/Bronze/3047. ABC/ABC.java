import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        String s = sc.next();
        int[] arr = {A, B, C};
        Arrays.sort(arr);

        for(int i=0; i<3; i++) {
            if(s.charAt(i) == 'A') {
                System.out.print(arr[0]+" ");
            } else if(s.charAt(i) == 'B') {
                System.out.print(arr[1]+" ");
            } else {
                System.out.print(arr[2]+" ");
            }
        }
    }
}