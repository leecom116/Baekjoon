import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[101][101];

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            String[] s = br.readLine().split(" ");
            int w = Integer.parseInt(s[0]);
            int h = Integer.parseInt(s[1]);

            for(int j=91-h; j<=100-h; j++) {
                for(int k=w+1; k<=w+10; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        int width = 0;

        for(int i=1; i<=100; i++) {
            for(int j=1; j<=100; j++) {
                width += arr[i][j];
            }
        }

        System.out.println(width);
    }
}