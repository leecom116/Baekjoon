import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); // 올라가는 길이
        int B = Integer.parseInt(st.nextToken()); // 내려가는 길이
        int V = Integer.parseInt(st.nextToken()); // 나무막대 높이

        int count = (V-B)/(A-B); // 정상까지 걸린 날짜

        if((V-B)%(A-B) != 0) { // 한번 더 남은 경우
            count++;
        }



        bw.write(count+"");

        bw.flush();
        bw.close();

    }
}