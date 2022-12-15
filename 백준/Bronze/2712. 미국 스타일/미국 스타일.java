import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i=0; i<T; i++) {
            double num = sc.nextDouble();
            String s = sc.next();

            if(s.equals("kg")) {
                System.out.println(String.format("%.4f lb", num*2.2046));
            } else if(s.equals("l")) {
                System.out.println(String.format("%.4f g", num*0.2642));
            } else if(s.equals("lb")) {
                System.out.println(String.format("%.4f kg", num*0.4536));
            } else if(s.equals("g")) {
                System.out.println(String.format("%.4f l", num*3.7854));
            }
        }
    }
}