import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        sb.append("int a;\n");





        for(int i=1; i<=input; i++) {

            String s = "";

            for(int j=1; j<=i; j++) {

                s += "*";

            }

            if(i == 1) {
                sb.append("int "+s+"ptr "+"= &a;\n");
            } else if(i == 2) {
                sb.append("int "+s+"ptr"+i+ " = &ptr;\n");
            } else {
                sb.append("int " +s+"ptr" + i + " = &ptr" + (i-1)+";\n");
            }
        }

        System.out.println(sb.toString());


    }
}