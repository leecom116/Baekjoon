import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<List<Integer>> list = new ArrayList<>();
        int[] rank = new int[N];
        List<Integer> weight = new ArrayList<>();
        List<Integer> height = new ArrayList<>();

        for(int i=0; i<N; i++) {
            weight.add(sc.nextInt());
            height.add(sc.nextInt());
        }

        list.add(weight);
        list.add(height);

        for(int i=0; i<N; i++) {
            int w = weight.get(i);
            int h = height.get(i);
            weight.remove(i);
            height.remove(i);

            for(int j=0; j<N-1; j++) {
                if(w < weight.get(j) && h < height.get(j)) {
                    rank[i]++;
                }
            }

            weight.add(i, w);
            height.add(i, h);

        }



        for(int i=0; i<rank.length; i++) {
            System.out.print(rank[i]+1 + " ");
        }

    }
}