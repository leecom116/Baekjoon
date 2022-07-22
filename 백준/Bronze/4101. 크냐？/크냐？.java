import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a , b;

        while(true) {

            a = sc.nextInt();
            b = sc.nextInt();

            if(a==0 && b==0) {
                break;
            }
            else if(a>b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }

    }
}