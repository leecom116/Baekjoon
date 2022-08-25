import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 수의 개수

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<N; i++) {
            list.add(sc.nextInt()); // N개의 개수만큼 숫자를 입력받아 list에 추가
        }

        Collections.sort(list);
        // Timsort
        // 시간 복잡도 O(n) ~ O(nlogn)
        // 합병 및 삽입정렬 알고리즘 (hybrid stable sorting algorithm)

        StringBuilder sb = new StringBuilder();

        for(int a : list) { // 향상된 for문. list에 있는 int 요소들을 sb에 하나씩 저장
            sb.append(a + "\n");
        }
        System.out.println(sb);
    }
}