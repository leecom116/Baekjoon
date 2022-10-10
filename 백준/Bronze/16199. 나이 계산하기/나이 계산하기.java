import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //태어난 날
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());

        //해당 날짜
        st = new StringTokenizer(br.readLine());
        int y2 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        
        //연 나이
        int year = y2 - y1;

        // 만 나이
        if(y1 == y2) {
            System.out.println(year);
        }else{
            if(m1 > m2) {
                System.out.println(year - 1);
            }else if(m1 == m2){
                if(d1 <= d2) {
                    System.out.println(year);
                }else {
                    System.out.println(year - 1);
                }
            }else{
                System.out.println(year);
            }
        }
        // 세는 나이 출력
        System.out.println(year + 1);
        
        // 연 나이 출력
        System.out.println(year);
    }

}