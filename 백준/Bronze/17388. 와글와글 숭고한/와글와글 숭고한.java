import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int Soongsil = Integer.parseInt(st.nextToken());
        int Korea = Integer.parseInt(st.nextToken());
        int Hanyang = Integer.parseInt(st.nextToken());

        if(Soongsil+Korea+Hanyang >= 100) {
            System.out.println("OK");
        } else {
            if(Soongsil < Korea && Soongsil < Hanyang) {
                System.out.println("Soongsil");
            } else if(Korea < Soongsil && Korea < Hanyang) {
                System.out.println("Korea");
            }  else if(Hanyang < Korea && Hanyang < Soongsil) {
                System.out.println("Hanyang");
            }
        }
    }
}