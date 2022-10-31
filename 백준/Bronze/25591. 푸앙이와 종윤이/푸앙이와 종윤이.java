import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((100-a)+" "+(100-b)+" "+(100-((100-a)+(100-b)))+" "+(100-a)*(100-b)+" "+((100-a)*(100-b))/100+" "+((100-a)*(100-b))%100);
        System.out.println(((100-((100-a)+(100-b))))+(((100-a)*(100-b))/100)+" "+((100-a)*(100-b))%100);
    }
}