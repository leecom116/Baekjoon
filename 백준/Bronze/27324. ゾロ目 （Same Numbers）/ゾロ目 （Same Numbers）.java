import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        if(input.charAt(0) == input.charAt(1)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}