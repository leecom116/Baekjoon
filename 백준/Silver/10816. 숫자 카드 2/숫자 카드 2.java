import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nArr = new int[N];

        for(int i=0; i<nArr.length; i++) {
            nArr[i] = sc.nextInt();
        }

        Arrays.sort(nArr);

        int M = sc.nextInt();
        int[] rArr = new int[M];

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<M; i++) {

            int key = sc.nextInt();

            sb.append(upperBound(nArr, key) - lowerBound(nArr, key)).append(" ");
        }

        System.out.println(sb);
    }

    private static int upperBound(int[] nArr, int key) {

        int low = 0;
        int high = nArr.length;

        // low와 high가 같을때까지 반복
        while(low < high) {

            int mid = (low + high) / 2;

            if(key < nArr[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }

        }
        return low;
    }

    private static int lowerBound(int[] nArr, int key) {

        int low = 0;
        int high = nArr.length;

        while(low < high) {

            int mid = (low + high) / 2;

            if(key <= nArr[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }

        }
        return low;
    }
}