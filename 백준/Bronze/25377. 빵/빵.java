import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int min = 1001;

        for(int i=0; i<N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

           if(A <= B) {
               if (min > B) {
                   min = B;
               }
           }
        }

        if(min == 1001) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }

    }
}