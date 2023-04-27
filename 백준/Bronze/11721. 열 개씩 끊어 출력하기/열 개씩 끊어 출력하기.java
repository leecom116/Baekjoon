import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        for(int i=0; i<s.length(); i++) {

            if(i != 0 && i % 10 == 0) {
                System.out.println();
            }

            System.out.print(s.charAt(i));

        }
    }
}