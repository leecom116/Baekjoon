import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a = N;

            for(int j=0; j<N; N--) {
                for(int k=N; k<a; k++) {
                    System.out.print(" ");
                }

                for(int i=0; i<2*N-1; i++) {
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}