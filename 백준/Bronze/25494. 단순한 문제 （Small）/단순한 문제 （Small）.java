import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T  = sc.nextInt();

        for(int i=0; i<T; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println(Math.min(Math.min(a,b),c));

        }
    }
}