import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// Scanner 객체 in를 선언
 
		int n = in.nextInt();
		
		int count = 1;
		
		int range = 2; 
		

		if (n == 1) {
		
			System.out.print(1);
			
		}
 
		else {
			while (range <= n) {
			
				range = range + (6 * count); 
				count++;
				/* 8 = 2 + (6) 이 처음 실행된다. count 값이 1 증가해서 2가 된다.
				while 문 조건값을 비교한다 range <= n 일 경우 while 문이 한번 더 실행된다.
				14 = 2 + (12)가 두 번째로 실행된다. count 값이 1 증가해서 3이 된다.
				또 while 문 조건값을 비교한다. range <= n일 경우 while 문이 한번 더 실행된다.
				계속해서 반복된다. range > n일 때까지 반복된다.
				 */
			}
			System.out.print(count);
			
		}
	}
}
