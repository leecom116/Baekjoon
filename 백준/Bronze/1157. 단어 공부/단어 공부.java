import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine(); // 단어 입력
        int arr[] = new int[26]; // A ~ Z 카운트용 배열 생성
        int max = 0;
        char ch = '?';

        for(int i=0; i<a.length(); i++) { // 문자열 길이만큼 반복
            if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') { // 대문자일 경우
                arr[a.charAt(i)-'A']++; // ex) a.charAt(i)가 A일 경우, arr[0]++
            } // A의 아스키코드값 65
            else if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z') { // 소문자일 경우
                arr[a.charAt(i)-'a']++; // ex) a.charAt(i)가 a일 경우, arr[0]++
            } // a의 아스키코드값 97
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) { 
                max = arr[i];
                ch = (char)(i+65); // 가장 많이 사용된 알파벳(대문자)저장
            }
            else if(arr[i]==max) { // 가장 많이 사용된 알파벳이 여러 개 존재하는 경우
                ch = '?'; 
            }
        }
        System.out.print(ch);
    }
}