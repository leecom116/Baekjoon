import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {

            int a = sc.nextInt();

            if(a == 0) {
                break;
            }

            int[] arr = new int[40];
            int sum = 1;

            for(int i=0; i<2*a; i++) {
                arr[i] = sc.nextInt();

                if(i % 2 == 0) {
                    sum *= arr[i];
                } else {
                    sum -= arr[i];
                }
            }

            System.out.println(sum);

        }


    }
}