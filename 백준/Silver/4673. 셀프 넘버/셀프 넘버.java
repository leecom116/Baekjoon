
public class Main {
    public static void main(String[] args) {
        boolean[] arr = new boolean[10001]; // 셀프 넘버를 추출하기 위해 배열 생성

        for(int i=1; i<10001; i++) {
            int n = d(i); // 셀프 넘버가 아닌 값 저장

            if(n<10001) {
                arr[n] = true; // arr[셀프 넘버가 아닌 값] = true
            } // true인 값을 거르기 위해 사용
        }

        for(int i=1; i<10001; i++) {
            if(arr[i]==false) { // i가 셀프 넘버일 경우
                System.out.println(i); // 셀프 넘버 출력
            }
        }
    }

    // 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수
    public static int d(int num) {
        int sum = num;
        while(num !=0) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }
}
