import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        Character[] arr = new Character[s.length()];

        for(int i=0; i<s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(char item : arr) {
            System.out.print(item);
        }
    }
}