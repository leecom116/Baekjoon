import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        double b = sc.nextInt();

        if(a-((a*(b/100)))>=100) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}