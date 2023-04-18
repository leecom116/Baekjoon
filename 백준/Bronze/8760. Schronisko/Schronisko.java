import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Z = sc.nextInt();

        for(int i=0; i<Z; i++) {
            int W = sc.nextInt();
            int K = sc.nextInt();

            System.out.println(W * K / 2);
        }

    }
}