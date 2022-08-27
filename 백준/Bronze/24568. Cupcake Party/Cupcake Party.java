import java.beans.BeanInfo;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        if((a*8)+(b*3)-28 <0) {
            System.out.println(0);
        }
        else {
            System.out.println(((a*8)+(b*3))-28);
        }
    }
}