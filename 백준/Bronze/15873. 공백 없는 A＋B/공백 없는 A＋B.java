import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        if(s.length() == 2) {
            System.out.println((s.charAt(0)-'0')+(s.charAt(1)-'0'));
        } else if(s.length() == 3 && s.charAt(0)=='1' && s.charAt(1)=='0') {
            System.out.println(10 + (s.charAt(2)-'0'));
        } else if(s.length() == 3 && s.charAt(1)=='1' && s.charAt(2)=='0') {
            System.out.println(10 + (s.charAt(0)-'0'));
        } else {
            System.out.println(20);
        }
    }
}