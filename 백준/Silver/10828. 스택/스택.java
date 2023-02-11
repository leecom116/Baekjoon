import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // stack은 LIFO 구조
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> sta = new Stack<>();

        // 마지막으로 push한 요소 값
        int last = 0;

        for(int i=0; i<N; i++) {
            // 공백 기준으로 잘라 push와 숫자를 분리
            StringTokenizer st = new StringTokenizer(br.readLine());

            String s = st.nextToken();

            switch(s) {
                case "push":
                    last = Integer.parseInt(st.nextToken());
                    sta.push(last);
                    break;
                case "pop":
                    if(sta.isEmpty()) sb.append(-1).append("\n");
                    else {
                        sb.append(sta.pop()).append("\n");
                        if(! sta.isEmpty()) {
                            last = sta.peek();
                        }
                    }
                    break;
                case "size":
                    sb.append(sta.size()).append("\n");
                    break;
                case "empty":
                    if(sta.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "top":
                    if(sta.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(last).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}