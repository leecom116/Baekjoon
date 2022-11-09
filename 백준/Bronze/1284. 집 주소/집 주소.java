import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {

            int width = 0;
            String input = sc.nextLine();

            if(input.equals("0")) {
                break;
            }

            for(int i=0; i<input.length(); i++) {
                if(input.charAt(i) == '1') {
                    width += 2;
                } else if(input.charAt(i) == '0') {
                    width += 4;
                } else {
                    width += 3;
                }
            }

            width += input.length() + 1;

            System.out.println(width);

        }
    }
}
