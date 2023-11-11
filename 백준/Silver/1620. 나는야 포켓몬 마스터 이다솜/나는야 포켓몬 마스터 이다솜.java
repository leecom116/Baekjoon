import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");

        // 도감
        int N = Integer.parseInt(s[0]);

        // 문제
        int M = Integer.parseInt(s[1]);

        // String[] arr = new String[N];
        HashMap<Integer, String> intMap = new HashMap<>();
        HashMap<String, Integer> strMap = new HashMap<>();

        for(int i=0; i<N; i++) {
            String ss = br.readLine();
            intMap.put(i+1, ss);
            strMap.put(ss, i+1);
        }

        // HashMap 이용해서 문제 해결
        for(int i=0; i<M; i++) {
            String ss = br.readLine();

            try {
                int num = Integer.parseInt(ss);
                System.out.println(intMap.get(num));
            } catch(Exception e) {
                System.out.println(strMap.get(ss));
            }
        }
    }
}