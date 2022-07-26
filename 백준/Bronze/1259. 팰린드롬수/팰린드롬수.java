import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input;



        while(true) {

            input = sc.next();

            if (input.equals("0")) {
                break;
            }


            if (input.length() == 2) {
                if (input.charAt(0) == input.charAt(1)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            } else if (input.length() == 4) {
                if (input.charAt(0) == input.charAt(3) && input.charAt(1) == input.charAt(2)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
            else if (input.length() == 1) {
                System.out.println("yes");
            } else if (input.length() == 3) {
                if (input.charAt(0) == input.charAt(2)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            } else if (input.length() == 5) {
                if (input.charAt(0) == input.charAt(4) && input.charAt(1) == input.charAt(3)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }


        }

    }
}