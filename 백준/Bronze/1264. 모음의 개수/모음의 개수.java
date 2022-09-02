import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            int count = 0;
            String s = br.readLine();

            if(s.equals("#")) {
                break;
            }

            s = s.toLowerCase(); // 문자열을 소문자로

            for(int i=0; i<s.length(); i++) {

                switch (s.charAt(i)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        count++;
                    default:
                        break;
                }


            }

            System.out.println(count);

        }
    }
}