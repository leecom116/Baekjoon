import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int isFd = 1;

        for(int i=0; i<s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
                isFd = 0;
            }
        }
        System.out.println(isFd);
    }
}