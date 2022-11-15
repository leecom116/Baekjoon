import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                sb.append(" ");
            }
            for(int k=0; k<(2*i)+1; k++) {
                sb.append("*");
            }

            sb.append("\n");
        }

        for(int j=0; j<N-1; j++) {
            for(int i=0; i<=j; i++) {
                sb.append(" ");
            }
            for(int k=j*2; k<(2*(N-1))-1; k++) {
                sb.append("*");
            }

            sb.append("\n");
        }


        System.out.println(sb);
    }
}