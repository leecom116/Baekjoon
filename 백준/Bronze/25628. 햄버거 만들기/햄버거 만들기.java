import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);

        int count = 0;

        while(true) {

            A -= 2;
            B--;

            if(A < 0 || B < 0) {
                break;
            }

            count++;

        }

        System.out.println(count);
    }
}