import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double shield = 0;

        int[] arr = new int[N];

        for(int i=0; i<N; i++) {

            int ignore = sc.nextInt();

            shield = 1 - (1-shield) * (1-(0.01*ignore));

            System.out.printf("%f\n", shield*100);
        }


    }
}