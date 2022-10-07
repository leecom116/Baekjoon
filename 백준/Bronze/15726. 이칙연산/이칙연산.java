import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        int max = 0;

        if(a*b/c >= a/b*c) {
            max = (int)(a*b/c);
            System.out.println(max);
        } else {
            max = (int)(a/b*c);
            System.out.println(max);
        }
    }
}