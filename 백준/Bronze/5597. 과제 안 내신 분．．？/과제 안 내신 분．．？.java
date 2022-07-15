import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] arr = new boolean[31];

        for(int i=0; i<28; i++) {
            arr[sc.nextInt()]= true;
        }

        for(int i=1; i<arr.length; i++) {
            if(arr[i] == false) {
                System.out.println(i);
            }
        }



    }
}