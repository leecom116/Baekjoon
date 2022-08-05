import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BigInteger total = new BigInteger(bf.readLine());
        BigInteger diff = new BigInteger(bf.readLine());
        BigInteger two = new BigInteger("2");
        
        BigInteger klaudia = (total.subtract(diff)).divide(two).add(diff); //(total-diff)/2+diff
        BigInteger natalia = (total.subtract(diff)).divide(two); //(total-diff)/2
        
        System.out.println(klaudia);
        System.out.println(natalia);
 
    }
 
}