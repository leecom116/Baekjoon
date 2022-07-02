import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt(); // 테스트 케이스의 개수

        for(int i=0; i<T; i++) {

            int R = scan.nextInt(); // 반복 횟수
            String S = scan.next();

            for(int j=0; j<S.length(); j++) { // 문자열 S의 길이만큼 반복
                for(int k=0; k<R; k++) { // 반복 횟수 만큼 반복
                    System.out.print(S.charAt(j)); // 인덱스 번호에 있는 char 요소 출력
                }
            }
            System.out.println();
        }
    }
}