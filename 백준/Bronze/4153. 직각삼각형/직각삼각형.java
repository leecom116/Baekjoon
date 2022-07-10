import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a==0 && b==0 && c==0) {
                break; // 반복문을 빠져 나온다.
            }
            else if((a*a)+(b*b)==(c*c) || (b*b)+(c*c)==(a*a) || (a*a)+(c*c)==(b*b)) {
            // 3개의 변수중에 변의 길이가 가장 긴 것이 어느 변수에 들어갈지 모르므로 3가지의 경우의 수를 지정한다.
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }

        }
    }
}
