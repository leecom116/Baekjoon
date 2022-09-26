import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] a = br.readLine().split(" ");

        int N = Integer.parseInt(a[0]);
        int M = Integer.parseInt(a[1]);

        StringBuffer sb; // StringBuffer를 이용하여 reverse() 메소드 사용

        for(int i=0; i<N; i++) {
            String s = br.readLine();
            sb = new StringBuffer(s);

            System.out.println(sb.reverse());
        }
    }
}