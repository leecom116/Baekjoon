import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        if(M == 1 || M == 2) {
            System.out.println("NEWBIE!");
        } else if(N >= M) {
            System.out.println("OLDBIE!");
        } else {
            System.out.println("TLE!");
        }
    }
}