import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 영식 요금제 합계
        long sumY = 0;
        // 민식 요금제 합계
        long sumM = 0;

        for(int i=0; i<N; i++) {
            int input = sc.nextInt();

            for(int j=0; j<(input/30)+1; j++) {
                sumY += 10;
            }
            for(int j=0; j<(input/60)+1; j++) {
                sumM += 15;
            }
        }

        if(sumY < sumM) {
            System.out.println("Y " + sumY);
        } else if(sumY > sumM) {
            System.out.println("M " + sumM);
        } else {
            System.out.println("Y M " + sumY);
        }
    }
}