import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum1 = (a % 10 * 100) +(a / 10 % 10 * 10) + (a / 100);
        int sum2 = (b % 10 * 100) +(b / 10 % 10 * 10) + (b / 100);

        if(sum1 < sum2) {
            System.out.print(sum2);
        }
        else if(sum1 > sum2) {
            System.out.print(sum1);
        }




    }
}