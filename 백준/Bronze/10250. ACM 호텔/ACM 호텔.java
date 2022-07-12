import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int a, b, floor;


        for(int i=0; i<T; i++) {

            int H = sc.nextInt(); // 6
            int W = sc.nextInt(); // 12
            int N = sc.nextInt(); // 10

            if(N%H == 0) {
                a = H * 100;
                b = N / H;
            }
            else {
                a = (N % H) * 100;
                b = (N / H) + 1;
            }

            System.out.println(a+b);
        }

    }
}