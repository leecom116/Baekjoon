import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] arr = new boolean[31]; 

        for(int i=0; i<28; i++) {
            arr[sc.nextInt()]= true; // 입력된 숫자에 따라 해당 하는 인덱스 번호에 true를 대입
        }

        for(int i=1; i<arr.length; i++) {
            if(arr[i] == false) { // 입력이 안 된 숫자일 경우
                System.out.println(i);
            }
        }



    }
}
