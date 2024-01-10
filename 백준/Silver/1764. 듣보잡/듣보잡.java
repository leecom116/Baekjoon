import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        Set<String> set = new HashSet<>();
        for(int i=0; i<n; i++) {
            set.add(br.readLine());
        }

        int count = 0;
        List<String> list = new ArrayList<>();
        for(int i=0; i<m; i++) {
            String s = br.readLine();
            if(set.contains(s)) {
                list.add(s);
                count++;
            }
        }

        Collections.sort(list);
        System.out.println(count);

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}