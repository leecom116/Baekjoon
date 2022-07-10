import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int prevSumCount = 0; // 이전 대각선 카운트의 합 ex) X가 6일 경우, 이전 대각선들의 합 prevSumCount == (1 + 2)
        int crossCount = 1; // ex) X가 6일 경우, 현재 대각선 crossCount == 3


        while (true) {
            if (X <= prevSumCount + crossCount) { // 대각선의 범주 안에 X가 속해 있을 동안 반복
                if (crossCount % 2 == 1) { // 현재 대각선의 개수가 홀수일 경우
                    System.out.println((crossCount - (X - prevSumCount - 1)) + "/" + (X - prevSumCount));
                    break;
                } else { // 현재 대각선의 개수가 짝수일 경우
                    System.out.print((X - prevSumCount) + "/" + (crossCount - (X - prevSumCount - 1)));
                    break;
                }
            } else { // X가 대각선의 범주 밖에 있을 경우
                prevSumCount += crossCount; // 현재 대각선의 개수를 추가로 저장
                crossCount++; // 대각선의 개수는 1씩 커지므로 1을 더한다.
            }
        }
    }
}
