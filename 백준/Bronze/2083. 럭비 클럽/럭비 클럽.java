import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String[] s = new String[3];

       while(true) {

           for(int i=0; i<3; i++) {
               s[i] = sc.next();
           }

           if(s[0].equals("#") && s[1].equals("0") && s[2].equals("0")) {
               System.exit(0);
           }

           if(Integer.parseInt(s[1]) > 17 || Integer.parseInt(s[2]) >= 80) {
               System.out.println(s[0] + " " + "Senior");
           } else {
               System.out.println(s[0] + " " + "Junior");
           }

       }
    }
}