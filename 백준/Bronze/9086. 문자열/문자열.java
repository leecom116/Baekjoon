import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        String input;


        for(int i=0; i<T; i++) {

            input = sc.next();

            System.out.println(String.valueOf(input.charAt(0)) + String.valueOf(input.charAt(input.length()-1)));



        }

    }
}