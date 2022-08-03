
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        int N = Integer.parseInt(br.readLine());
        String temp;


        for(int i=666; ; i++) {
            temp = Integer.toString(i);

            for(int j=0; j<temp.length()-2; j++) {
                if(temp.charAt(j)=='6' && temp.charAt(j+1)=='6' && temp.charAt(j+2)=='6') {
                    count++;
                    break;
                }
            }

            if(count == N) {
                System.out.println(temp);
                break;
            }
        }



    }
}