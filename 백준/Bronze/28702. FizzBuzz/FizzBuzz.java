import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        boolean isNum = false;

        for(int i=0; i<3; i++) {
            String s = br.readLine();

            // 숫자일 경우
            if(! s.equals("Fizz")
                    && ! s.equals("Buzz")
                    && ! s.equals("FizzBuzz")) {
                result = Integer.parseInt(s);
                isNum = true;
            }

            // 다음 숫자 추측을 위해 +1
            if(isNum) {
                result++;
            }
        }

        if(result % 3 == 0 && result % 5 == 0) {
            System.out.print("FizzBuzz");
        } else if(result % 3 == 0) {
            System.out.print("Fizz");
        } else if(result % 5 == 0) {
            System.out.print("Buzz");
        } else {
            System.out.print(result);
        }
    }
}