import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int count = 0;

        s = s.replaceAll("[^A-Z]", "");

        for(int i=0; i<s.length(); i++) {
            if(count==0) {
                if(s.charAt(i) == 'U') {
                    count++;
                }
            } else if(count==1) {
                if(s.charAt(i) == 'C') {
                    count++;
                }
            } else if(count==2) {
                if(s.charAt(i) == 'P') {
                    count++;
                }
            } else if(count==3) {
                if(s.charAt(i) == 'C') {
                    count++;
                }
            }
        }

        if(count==4) {
            System.out.println("I love UCPC");
        }else {
            System.out.println("I hate UCPC");
        }
    }
}