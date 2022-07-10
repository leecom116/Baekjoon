import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int prevSumCount = 0, crossCount = 1;


        while (true) {
            if (X <= prevSumCount + crossCount) {
                if (crossCount % 2 == 1) {
                    System.out.println((crossCount - (X - prevSumCount - 1)) + "/" + (X - prevSumCount));
                    break;
                } else {
                    System.out.print((X - prevSumCount) + "/" + (crossCount - (X - prevSumCount - 1)));
                    break;
                }
            } else {
                prevSumCount += crossCount;
                crossCount++;
            }
        }
    }
}
