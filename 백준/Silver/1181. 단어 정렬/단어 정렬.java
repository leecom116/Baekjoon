import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[Integer.parseInt(br.readLine())];

        for(int i=0; i<arr.length; i++) {
            arr[i] = br.readLine();
        }

       Arrays.sort(arr, new Comparator<String>() {
                   @Override
                   public int compare(String o1, String o2) {
                       if(o1.length() == o2.length()) { // 길이가 같으면
                           return o1.compareTo(o2); // 사전식 정렬
                       }
                       return o1.length()-o2.length();
                       // 문자열 길이가 더 짧은순으로 정렬
                   }
               });


               // 중복요소 제외시키기
               List < String > list = new ArrayList<String>();
        for(int i=0; i<arr.length; i++) {
            if(!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }

        // 출력
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
