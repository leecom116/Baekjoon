import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count = 0;
        int N = sc.nextInt();
                sc.nextLine();
        for(int i=0; i<N; i++) {
            String n = sc.nextLine();

            if(s.equals(n)) {
                count++;
            }

        }

        System.out.println(count);
    }
}