import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i=0; i<T; i++) {
            int C = sc.nextInt();

            int q = C / 25;
            int d = (C % 25) / 10;
            int n = ((C % 25) % 10) / 5;
            int p = ((C % 25) % 10) % 5;

            System.out.println(q+" "+d+" "+n+" "+p);
        }
    }
}