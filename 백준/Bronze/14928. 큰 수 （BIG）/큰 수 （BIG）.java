import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 시간초과 코드
        // bBigInteger bi = new BigInteger(br.readLine());
        // System.out.println(bi.mod(BigInteger.valueOf(20000303)));


        String N = br.readLine();
        long remain = 0;

        for(int i=0; i<N.length(); i++) {
            remain = (remain * 10 + (N.charAt(i) -'0')) % 20000303;
        } // 자릿수를 한단계씩 늘리면서
        bw.write(remain+"\n"); // bw.write는 무조건 문자열 형식이어야 한다.
        bw.flush();
        br.close();
        bw.close();



    }
}