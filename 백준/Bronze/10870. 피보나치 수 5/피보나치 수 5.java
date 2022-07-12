import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

       System.out.println(Fibonacci(n));

    }

    static int Fibonacci(int n) { // 재귀 함수
        // static method
        // 객체 생성 없이 호출 가능한 메소드
        
        if(n == 0) return 0;
        if(n == 1) return 1;

        return Fibonacci(n-1) + Fibonacci(n-2);

    }
}