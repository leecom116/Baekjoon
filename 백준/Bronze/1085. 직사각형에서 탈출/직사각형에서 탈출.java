import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        int x_min = Math.min(x, w-x); // x와 w-x 중 더 작은 값을 x_min에 저장
        int y_min = Math.min(y, h-y); // y와 h-y 중 더 작은 값을 y_min에 저장

        System.out.print(Math.min(x_min, y_min)); // x_min과 y_min중  더 작은 값을 출력
    }
}