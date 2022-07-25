import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 카드의 개수
        int M = sc.nextInt(); // 카드에 쓰여 있는 수
        int sum = 0, max = 0;
        int arr[] = new int[N]; // N개의 길이를 가진 배열 생성

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt(); // 카드의 개수만큼 데이터 입력
        }

        // 브루트포스 알고리즘(완전 탐색)
        // 가능한 모든 경우의 수를 모두 탐색하면서 요구조건에 충족되는 결과만 가져온다.
        // 3중 for문을 사용하여 서로 다른 3개의 카드에 쓰여 있는 숫자 합을 구한다.
        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                for(int k=j+1; k<N; k++) {
                    sum = arr[i] + arr[j] + arr[k];

                    if(sum > max && sum <= M) { 
        // 기존 경우의 수중에 큰 값(max)보다 크고 카드에 쓰여 있는 수보다 작거나 같을 경우
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);


    }

}
