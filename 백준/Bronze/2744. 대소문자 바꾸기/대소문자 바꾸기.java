import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        for(int i=0; i<input.length(); i++) {

            // 문자열(input)에 i(인덱스번호)에 해당하는 문자를 저장
            char a = input.charAt(i);
            if(Character.isUpperCase(a)) { // 문자가 대문자일 경우
                System.out.print(String.valueOf(a).toLowerCase());
            } // a 값을 소문자로 바꾼다.
            else if(Character.isLowerCase(a)) { // 문자가 소문자일 경우
                System.out.print(String.valueOf(a).toUpperCase());
            } // a 값을 대문자로 바꾼다.
        }

    }
}