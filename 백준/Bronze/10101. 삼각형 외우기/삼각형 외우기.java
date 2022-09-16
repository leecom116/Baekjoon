import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == 60 && b == 60 && c == 60) {
            System.out.println("Equilateral");
        } else if(((a+b+c)== 180 && a==b ) || ((a+b+c)== 180 && b==c ) || ((a+b+c)== 180 && c==a )) {
            System.out.println("Isosceles");
        } else if (((a+b+c)== 180 && a!=b ) || ((a+b+c)== 180 && b!=c ) || ((a+b+c)== 180 && c!=a )) {
            System.out.println("Scalene");
        } else if(a+b+c != 180) {
            System.out.println("Error");
        }
    }
}