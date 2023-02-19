import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        exit :
        for(int i=M; i<=N; i++) {

            if(i == 1) {
                continue;
            }

            for(int j=2; j<i; j++) {
                // 소수가 아니면
                if(i % j == 0) {
                    continue exit;
                }

            }

            list.add(i);

        }

        if(list.isEmpty()) {
            System.out.println(-1);
        } else {

            long sum = 0;

            for(int i : list) {
                sum += i;
            }

            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}