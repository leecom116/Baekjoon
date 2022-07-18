import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int sum = 0, temp = 0;



        for(int i=1; i<input; i++) {

            temp = i;
            sum = temp;

            for(int j=i; j>0;) {

                sum += (j % 10);
                j /= 10;

            }


            if(sum == input) {
                System.out.println(temp);
                System.exit(0);
            }
        }

        System.out.println(0);

    }
}