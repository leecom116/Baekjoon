import java.util.Scanner;

public class Main {

    public static boolean[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        arr = new boolean[N+1];
        get_arr();

        for(int i=M; i<=N; i++) {
            // 소수이면
            if(!arr[i]) System.out.println(i);
        }

    }

    // 에라토스테네스의 체 알고리즘 이용
    public static void get_arr() {
        // true = 소수x(합성수), false = 소수
        arr[0] = arr[1] = true;

        // N의 제곱근만큼 반복
        for(int i=2; i<=Math.sqrt(arr.length); i++) {
            // 이미 true(소수x) 처리되었으면 pass.
            if(arr[i]) continue;

            // i 자기자신을 제외한 배수들을 true(소수x) 처리
            for(int j = i*i; j<arr.length; j+=i) {
                arr[j] = true;
            }
        }
    }
}