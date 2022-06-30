import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int sum[][] = new int[a][b];

       for(int i=0; i<2; i++) {
           for(int j=0; j<a; j++) {
               for(int k=0; k<b; k++) {
                   sum[j][k] += scan.nextInt();
               }
           }
       }

        for(int i=0; i<a; i++) {
            for(int j=0; j<b; j++) {
                System.out.printf("%d ", sum[i][j]);
            }
            System.out.println();
        }

    }
}
