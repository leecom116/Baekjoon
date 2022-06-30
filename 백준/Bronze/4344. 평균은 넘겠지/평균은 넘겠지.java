import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int C = scan.nextInt(); // 테스트 케이스의 개수
       for (int i=0; i<C; i++) {
           double ave = 0; // 점수 평균
           double sum = 0; // 점수 합계

           int[] arr = new int[scan.nextInt()];
           // 입력한 숫자만큼의 길이를 가진 배열 생성

           for(int j=0; j<arr.length; j++) {
               arr[j] = scan.nextInt();
               ave += arr[j]; // ave = ave + arr[j]
           }
           ave = ave / arr.length;

           for(int k=0; k<arr.length; k++) {
               if(arr[k]>ave) { // 평균보다 해당 배열 요소 값이 더 클 경우
                   sum += 1; //sum = sum + 1
                   }
               }
               System.out.printf("%.3f%%%n", (sum/arr.length)*100);


       }

    }
}