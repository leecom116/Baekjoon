import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {

            String s = br.readLine();

            if(s.equals("END")) { // 문자열을 비교할 경우, ==이 아닌 equals() 메서드를 이용한다.
                break;
            }

            char[] arr = new char[s.length()];

            for(int i=0; i<arr.length; i++) {

                arr[i] = s.charAt(s.length()-i-1);
                System.out.print(arr[i]);
            }
            System.out.println();

        }
    }
}