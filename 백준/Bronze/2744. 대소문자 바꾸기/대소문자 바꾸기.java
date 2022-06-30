import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        char[] a = input.toCharArray();

        for(int i=0; i<input.length(); i++) {
            if(a[i]>=65 && a[i]<=90) {
                a[i] = (char)(a[i] + 32);
                System.out.print(a[i]);
            }
            else if(a[i]>=97 && a[i]<=122) {
                a[i] = (char)(a[i] - 32);
                System.out.print(a[i]);
            }
        }
        
    }
}
