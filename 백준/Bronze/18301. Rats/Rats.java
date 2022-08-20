
// N := ⌊(n1 + 1)(n2 + 1)/(n12 + 1) - 1⌋

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a+1)*(b+1)/(c+1) - 1);
    }
}