import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        String temp = "";


        String s = br.readLine();

        for(int i=0; i<n; i++) {
            if((s.charAt(i) - '0') >= 0 && (s.charAt(i) - '0') <= 9) {
                temp += Character.toString(s.charAt(i));
            } else {
                if(!temp.equals("")) {
                    sum += Long.parseLong(temp);
                    temp = "";
                }

            }

        }

        // 문자열의 마지막이 숫자인 경우, 마지막 숫자 또한 합산
        if(!temp.equals("")) {
            sum += Long.parseLong(temp);
            temp = "";
        }

        System.out.println(sum);


    }
}