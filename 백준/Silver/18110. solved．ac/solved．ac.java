import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        double sum = 0;

        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int minus = (int)Math.round((n * 0.15));

        for(int i=minus; i<arr.length-minus; i++) {
            sum += arr[i];
        }

        System.out.println(Math.round(sum/(n-minus*2L)));
    }
}