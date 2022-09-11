import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        int K = sc.nextInt();

        for(int i=1; i<=N; i++) {
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();

        sb.append("<");

        for(int i=K-1; list.size()>1; i=(i+(K-1))%list.size()) {

            sb.append(list.get(i)+", ");
            list.remove(i);
            

        }

        sb.append(list.get(0)+">");
        System.out.println(sb);


    }
}
