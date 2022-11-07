import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int check = sc.nextInt();
        int price = sc.nextInt();

        if(check >= 20) {

            if(price * 0.75 > price - 2000) {
                price = price - 2000;
            } else {
                price *= 0.75;
            }

        } else if(check >= 15) {

            if(price - 2000 > price * 0.9) {
                price *= 0.9;
            } else {
                price -= 2000;
            }

        } else if(check >= 10) {

            if(price * 0.9 > price - 500) {
                price -= 500;
            } else {
                price *= 0.9;
            }

        } else if(check >= 5) {
            price -= 500;
        }

        if(price < 0) {
            price = 0;
        }

        System.out.println(price);
    }
}