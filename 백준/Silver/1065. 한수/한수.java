import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        boolean arr[] = new boolean[1001];
        int sum = 0;

        for(int i=1; i<=N; i++) {
            arr[i] = S(i);
            if(arr[i]) {
                sum += 1;
            }
        }
        if(N<100) {
            System.out.println(N);
        }
        else {
            System.out.println(99+sum);
        }
    }

    public static boolean S(int n) {
        int a, b, c;
       if(100<=n && n<=1000) {
           c = n % 10;
           n = n / 10;
           b = n % 10;
           a = n / 10;
           if(a==(b-1)&&(b-1)==(c-2)) {
               return true;
           }
           else if(a==(b-2)&&(b-2)==(c-4)) {
               return true;
           }
           else if(a==(b-3)&&(b-3)==(c-6)) {
               return true;
           }
           else if(a==(b-4)&&(b-4)==(c-8)) {
               return true;
           }
           else if(a==(b+1)&&(b+1)==(c+2)) {
               return true;
           }
           else if(a==(b+2)&&(b+2)==(c+4)) {
               return true;
           }
           else if(a==(b+3)&&(b+3)==(c+6)) {
               return true;
           }
           else if(a==(b+4)&&(b+4)==(c+8)) {
               return true;
           }
           else if(a==b&&b==c) {
               return true;
           }


       }
        return false;
    }
}
