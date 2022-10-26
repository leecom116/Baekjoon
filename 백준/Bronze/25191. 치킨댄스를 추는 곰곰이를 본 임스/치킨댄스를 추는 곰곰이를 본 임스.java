import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int store = sc.nextInt();
        int cola = sc.nextInt();
        int beef = sc.nextInt();

        if(store < (cola/2) + beef) {
            System.out.println(store);
        } else {
            System.out.println((cola/2) + beef);
        }
    }
}