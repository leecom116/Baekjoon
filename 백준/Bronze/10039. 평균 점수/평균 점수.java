import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for(int i=0; i<5; i++) {

            int input = sc.nextInt();

            if(input < 40) {
                input = 40;
            }

            sum += input;
        }

        System.out.println(sum/5);

    }

}