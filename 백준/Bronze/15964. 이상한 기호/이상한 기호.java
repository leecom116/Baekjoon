import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(ab(sc.nextLong(), sc.nextLong()));




    }

    public static long ab(long a, long b) {

        long sum = 0;
        sum = (a+b)*(a-b);

        return sum;

    }
}

