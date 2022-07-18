import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int sum = 0, temp = 0;


        // 브루트포스 알고리즘
        for(int i=1; i<input; i++) { // 입력한 만큼 반복

            temp = i;
            sum = temp;

            for(int j=i; j>0;) {

            // 각 자릿수의 합을 구한다.
                sum += (j % 10); 
                j /= 10;

            }


            if(sum == input) {
                System.out.println(temp);
                System.exit(0); // 프로그램 정상 종료
            }
        }

        System.out.println(0); // 생성자가 없을 경우, 0을 

    }
}
