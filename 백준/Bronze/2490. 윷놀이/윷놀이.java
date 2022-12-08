import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] x = br.readLine().split(" ");
        String[] y = br.readLine().split(" ");
        String[] z = br.readLine().split(" ");

        int b = 0; // 배(0)

        for(int i=0; i<x.length; i++) {
            if(x[i].equals("0")) {
                b++;
            }
        }

        if(b == 1) {
            System.out.println("A");
        } else if(b == 2) {
            System.out.println("B");
        } else if(b == 3) {
            System.out.println("C");
        } else if(b == 4) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }

        b = 0;

        for(int i=0; i<y.length; i++) {
            if(y[i].equals("0")) {
                b++;
            }
        }

        if(b == 1) {
            System.out.println("A");
        } else if(b == 2) {
            System.out.println("B");
        } else if(b == 3) {
            System.out.println("C");
        } else if(b == 4) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }

        b = 0;

        for(int i=0; i<z.length; i++) {
            if(z[i].equals("0")) {
                b++;
            }
        }

        if(b == 1) {
            System.out.println("A");
        } else if(b == 2) {
            System.out.println("B");
        } else if(b == 3) {
            System.out.println("C");
        } else if(b == 4) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }



    }
}