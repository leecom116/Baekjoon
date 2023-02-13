import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Queue<Integer> que = new LinkedList<>();

        for(int i=1; i<=N; i++) {
            que.add(i);
        }

        while(que.size() > 1) {
            // 첫번째 요소 제거
            que.poll();
            // 두번째 요소 제거 후 마지막에 추가
            int last = que.poll();
            que.add(last);
        }

        System.out.println(que.peek());
    }
}