import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[][] arr = new String[N][2];

        for(int i=0; i<N; i++) {
            for(int j=0; j<2; j++) {
                arr[i][j] = sc.next();
            }
        }

        // 첫번째, 가입한 순서대로 정렬(기본 정렬)
        // 두번째, 나이 오름차순 정렬(Comparator 사용)
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for(int i=0; i<N; i++) {
            for(int j=0; j<2; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}