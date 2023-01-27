import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {sc.nextInt(), sc.nextInt()};
        int[] arr2 = {sc.nextInt(), sc.nextInt()};
        int[] arr3 = {sc.nextInt(), sc.nextInt()};

        int[] temp = {0, 0};

        if(arr1[0] == arr2[0]) {
            temp[0] = arr3[0];
        } else if(arr1[0] == arr3[0]) {
            temp[0] = arr2[0];
        } else {
            temp[0] = arr1[0];
        }

        if(arr1[1] == arr2[1]) {
            temp[1] = arr3[1];
        } else if(arr1[1] == arr3[1]) {
            temp[1] = arr2[1];
        } else {
            temp[1] = arr1[1];
        }

        System.out.print(temp[0]+ " " + temp[1]);



    }
}