import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in); // main()과 check()에서 사용하므로 Main 클래스에 static으로 생성

    public static void main(String[] args) {

        int N = scan.nextInt(); // 단어의 개수
        int count = 0; 

        for(int i=0; i<N; i++) { // 단어의 개수 만큼 반복
            
            if(check() == true) { // 그룹 단어일 경우
                count++; 
            }
        }
        System.out.println(count);
    }

    public static boolean check() {

        boolean[] check = new boolean[26]; // 'a'~'z' 알파벳 총 26개의 배열 생성
        int prev = 0; // 이전 문자를 정수(아스키 코드)로 저장
        String a = scan.next(); // 단어 입력 받음

        for(int i=0; i<a.length(); i++) { // 단어 길이만큼 반복
            
            int now = a.charAt(i); // 현재 문자를 정수(아스키 코드)로 저장
            
            if(prev != now) { // 이전 문자랑 현재 문자가 다를 경우
               if(check[now - 'a'] == false) { // 현재 문자로 처음 바뀐 경우
                   check[now - 'a'] = true;   // ex) now == 'a', check[0] = true
                   prev = now; // 다음으로 넘어가기 전 prev에 저장
               }
               else {
                   return false; // check[now - 'a'] == true, 그룹 단어가 아닐 경우
               }
            }
            else {
                continue;
            }
        }
        return true; // 그룹 단어일 경우
    }
}
