import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        String s = "int";

        for(int i=4; i<=input; i+=4) {
            s = "long " + s;
        }

        System.out.println(s);
    }
}