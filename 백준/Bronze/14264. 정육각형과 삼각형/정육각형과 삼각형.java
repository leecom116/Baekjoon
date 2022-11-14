import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        
        // cos 30도는 2분의 루트3
        System.out.println((Math.sqrt(3)/4)*(Math.pow(L,2)));
    }
}