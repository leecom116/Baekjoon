import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        if(a < 0) { // 냉동된 고기는 얼려있을때 데움 + 해동 + 얼려있지 않을때 데움
            a = -a;
            System.out.println((a*c)+d+(b*e));
        } else { // 상온의 고기는 데우기만 하면 된다.
            System.out.println((b-a)*e);
        }

    }
}