import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        for(int i=0; i<N; i++) {
            int input = sc.nextInt();

            // 예외(2일 경우)
            if(input == 2) {
                count++;
            }
            
            // 소수 판별
            for(int j=2; j<input; j++) {
                if(input%j==0) {
                    break;
                }
                if(j == input-1) {
                    count++;
                }
            }
        }

        System.out.println(count);


    }
}