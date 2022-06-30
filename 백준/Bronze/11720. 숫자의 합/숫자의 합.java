import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 숫자의 개수
        int sum = 0;
        String num = scan.next(); // next()는 개행문자 무시
        // nextLine()은 한줄 단위로 입력을 받기에 개행문자 포함

        for(int i=0; i<N; i++) {
            sum += (num.charAt(i)-'0');
            // charAt() 값을 int타입의 변수에 저장하므로 아스키코드로 변환되어 저장
            // -48 or -'0'을 해줘야 입력받은 숫자 값 저장 가능
        }
        System.out.print(sum);
    }
}