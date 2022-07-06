import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int N = scan.nextInt();
        int count = 0;

        for(int i=0; i<N; i++) {
            if(check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check() {

        boolean[] check = new boolean[26];
        int prev = 0;
        String a = scan.next();

        for(int i=0; i<a.length(); i++) {
            int now = a.charAt(i);
            if(prev != now) {
               if(check[now - 'a'] == false) {
                   check[now - 'a'] = true;
                   prev = now;
               }
               else {
                   return false;
               }
            }
            else {
                continue;
            }
        }
        return true;
    }
}