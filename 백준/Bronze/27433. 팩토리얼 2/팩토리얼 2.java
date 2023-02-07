import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long sum = 1;

        while(N > 1) {
            sum *= N;
            N--;
        }

        System.out.println(sum);
    }
}