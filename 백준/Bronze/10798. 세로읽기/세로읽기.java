import java.io.*;

public class Main {
    public static void main(String[] rgs) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

        char arr[][] = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String str = bfr.readLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] == 0) {
                    continue;
                }
                bfw.write(String.valueOf(arr[i][j]));
            }
        }

        bfr.close();
        bfw.flush();
        bfw.close();
    }
}