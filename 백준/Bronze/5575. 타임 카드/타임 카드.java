import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[6];
        int[] arr2 = new int[6];
        int[] arr3 = new int[6];

        for(int i=0; i<arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        if(arr1[2]>arr1[5]) { // 초끼리 뺄 때 모자를 경우
            arr1[4]-=1;
            arr1[5]+=60;
        }

        if(arr1[1]>arr1[4]) { // 분끼리 뺄 때 모자를 경우
            arr1[3]-=1;
            arr1[4]+=60;
        }

        System.out.println((arr1[3]-arr1[0])+" "+(arr1[4]-arr1[1])+" "+(arr1[5]-arr1[2]));


        for(int i=0; i<arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        if(arr2[2]>arr2[5]) { // 초끼리 뺄 때 모자를 경우
            arr2[4]-=1;
            arr2[5]+=60;
        }

        if(arr2[1]>arr2[4]) { // 분끼리 뺄 때 모자를 경우
            arr2[3]-=1;
            arr2[4]+=60;
        }

        System.out.println((arr2[3]-arr2[0])+" "+(arr2[4]-arr2[1])+" "+(arr2[5]-arr2[2]));

        for(int i=0; i<arr3.length; i++) {
            arr3[i] = sc.nextInt();
        }

        if(arr3[2]>arr3[5]) { // 초끼리 뺄 때 모자를 경우
            arr3[4]-=1;
            arr3[5]+=60;
        }

        if(arr3[1]>arr3[4]) { // 분끼리 뺄 때 모자를 경우
            arr3[3]-=1;
            arr3[4]+=60;
        }

        System.out.println((arr3[3]-arr3[0])+" "+(arr3[4]-arr3[1])+" "+(arr3[5]-arr3[2]));

    }
}