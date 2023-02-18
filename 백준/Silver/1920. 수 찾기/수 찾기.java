import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] nArr = new long[N];

        for(int i=0; i<N; i++) {
            nArr[i] = sc.nextLong();
        }

        Arrays.sort(nArr);

        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<M; i++) {
            long key = sc.nextLong();

            int count = binarySearch(nArr, key);

            sb.append(count).append("\n");
        }

        System.out.println(sb);

    }

    public static int binarySearch(long[] nArr, long key) {

        int front = 0;
        int back = nArr.length-1;

        // front가 back보다 커지기전까지 반복
        while(front <= back) {

            int mid = (front + back) / 2;

            if(key == nArr[mid]) {
                return 1;
            } else if(key < nArr[mid]) {
                back = mid - 1;
            } else {
                front = mid + 1;
            }
        }

        return 0;
    }
}