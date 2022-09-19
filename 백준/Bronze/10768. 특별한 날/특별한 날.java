import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();

        if(m == 2 && d == 18) {
            System.out.println("Special");
        } else if(m == 2 && d <= 17) {
            System.out.println("Before");
        } else if(m == 1) {
            System.out.println("Before");
        } else {
            System.out.println("After");
        }
    }
}