import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int com = 1;

        for(int i=0; i<N; i++) {
            int M = sc.nextInt();

            com += (M-1);
        }

        System.out.println(com);
    }
}