import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int a, b, c;

        int[] arr = {1, 2, 3};

        for(int i=0; i<N; i++) {

            int temp = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();

           temp = arr[x-1];
           arr[x-1] = arr[y-1];
           arr[y-1] = temp;



        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 1) {
                System.out.println(i+1);
            }
        }
    }


}
