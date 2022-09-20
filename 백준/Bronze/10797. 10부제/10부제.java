import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char num = br.readLine().charAt(0);

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int count = 0;

        while(st.hasMoreTokens()) {
            String car = st.nextToken();
            if(car.length()==2) {
                if(car.charAt(1)==num) {
                    count++;
                }
            } else if(car.length()==1) {
                if(car.charAt(0)==num) {
                    count++;
                }
            }
        }

        System.out.println(count);


    }
}