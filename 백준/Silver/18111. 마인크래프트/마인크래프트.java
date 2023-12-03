import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int B = Integer.parseInt(s[2]);

        int[][] arr = new int[N][M];

        int max = 0;
        int min = 256;

        for(int i=0; i<arr.length; i++) {
            String[] ss = br.readLine().split(" ");
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(ss[j]);

                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
                if(arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        int time = 99999999;
        int height = 0;

        for(int i=min; i<=max; i++) {
            int count = 0;
            int block = B;

            for(int j=0; j<arr.length; j++) {
                for(int k=0; k<arr[j].length; k++) {
                    if(arr[j][k] > i) {
                        count += (2*(arr[j][k] - i));
                        block += (arr[j][k] - i);
                    } else {
                        count += (i - arr[j][k]);
                        block -= (i - arr[j][k]);
                    }
                }
            }
            if(block < 0) break;

            if(count <= time) {
                time = count;
                height = i;
            }
        }

        System.out.println(time + " " + height);
    }
}