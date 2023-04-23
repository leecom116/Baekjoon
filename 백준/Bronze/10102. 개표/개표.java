import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int v = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int score_a = 0, score_b = 0;

        for(int i=0; i<v; i++) {
            if(s.charAt(i) == 'A') {
                score_a++;
            } else {
                score_b++;
            }
        }

        if(score_a > score_b) {
            System.out.println("A");
        } else if(score_a < score_b) {
            System.out.println("B");
        } else {
            System.out.println("Tie");
        }
    }
}