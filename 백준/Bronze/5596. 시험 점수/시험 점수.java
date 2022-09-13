import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = 0, b = 0;

        for(int i=0; i<2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int sum = 0;
            while(st.hasMoreTokens()) {

                sum += Integer.parseInt(st.nextToken());
            }
            if(i==0) {
                a = sum;
            } else if(i==1) {
                b = sum;
            }
        }

        if(a>b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }


    }
}