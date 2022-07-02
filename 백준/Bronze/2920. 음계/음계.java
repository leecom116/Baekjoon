import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[8];
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {8, 7, 6, 5, 4, 3, 2, 1};

        for(int i=0; i<arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        if(Arrays.equals(arr, arr1)) {
            System.out.print("ascending");
        }
        else if(Arrays.equals(arr, arr2)) {
            System.out.print("descending");
        }
        else {
            System.out.print("mixed");
        }
    }
}