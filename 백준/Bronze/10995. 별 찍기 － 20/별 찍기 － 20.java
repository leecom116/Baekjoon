import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++) {
           for(int j=0; j<N; j++) {
               if(i%2 == 0) {
                   sb.append("* ");
               } else {
                   sb.append(" *");
               }
           }
           sb.append("\n");
        }

        System.out.println(sb);
    }
}