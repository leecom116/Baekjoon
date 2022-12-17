import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 인원 수
        int X = sc.nextInt(); // 처음 목소리 높이
        int[] arr = new int[N];
        int level = 0;

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        ex:
        while(true) {
            for(int i=0; i<N; i++) {
                if(arr[i] < X) {
                    System.out.println(i+1);
                    break ex;
                }

                X++;
            }
        }
    }
}