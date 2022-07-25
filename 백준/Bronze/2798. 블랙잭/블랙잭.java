import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 카드의 개수
        int M = sc.nextInt(); // 카드에 쓰여 있는 수
        int sum = 0, max = 0;
        int arr[] = new int[N]; // N개의 길이를 가진 배열 생성

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }


        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                for(int k=j+1; k<N; k++) {
                    sum = arr[i] + arr[j] + arr[k];

                    if(sum > max && sum <= M) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);


    }

}
