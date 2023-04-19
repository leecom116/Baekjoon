import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int count = 0;

        for(int i=0; i<3; i++) {
            if(s.charAt(i) == '5') {
                count++;
            }
        }

        if(count == 3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}