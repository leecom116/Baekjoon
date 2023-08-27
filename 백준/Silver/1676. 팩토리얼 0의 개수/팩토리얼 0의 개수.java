import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        while(N >= 5) {
            count += N / 5;
            N = N / 5;
        }
        System.out.println(count);
    }
}