import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i=0; i<T; i++) {

            System.out.println(money(sc.nextInt(), sc.nextInt()));;

        }
    }

    public static int money(int a, int b) {

        switch(a) {
            case 1:
                a = 5000000;
                break;
            case 2: case 3:
                a = 3000000;
                break;
            case 4: case 5: case 6:
                a = 2000000;
                break;
            case 7: case 8: case 9: case 10:
                a = 500000;
                break;
            case 11: case 12: case 13: case 14: case 15:
                a = 300000;
                break;
            case 16: case 17: case 18: case 19: case 20: case 21:
                a = 100000;
                break;
            default:
                a = 0;
                break;
        }

        switch(b) {
            case 1:
                b = 5120000;
                break;
            case 2: case 3:
                b = 2560000;
                break;
            case 4: case 5: case 6: case 7:
                b = 1280000;
                break;
            case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15:
                b = 640000;
                break;
            case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23:
            case 24: case 25: case 26: case 27: case 28: case 29: case 30: case 31:
                b = 320000;
                break;
            default:
                b = 0;
                break;
        }

        return a + b;

    }
}