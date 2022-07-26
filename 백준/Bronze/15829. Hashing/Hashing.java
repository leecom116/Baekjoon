import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		String S = br.readLine();
		BigInteger result = new BigInteger("0");
		for(int i = 0; i < L; i++) {
        //좀 길지만 result에 현자 자릿수의 알파벳에서 정수 1~26중 해당 값을 더해주고
        //그 값에 31의 i제곱한 값을 곱해주는 것이다.
			result = result.add(BigInteger.valueOf(S.charAt(i) - 96).multiply(BigInteger.valueOf(31).pow(i)));
		}
        //출력할때는 1234567891을 나눠주자.
		System.out.println(result.remainder(BigInteger.valueOf(1234567891)));
	}

}