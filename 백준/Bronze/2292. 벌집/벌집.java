import java.util.Scanner;
// java.util.Scanner 클래스를 import 한다.

public class Main {
// 접근제어자 public으로 main class를 선언한다.
	public static void main(String[] args) {
	// 접근제어자 public으로 메모리에 상주하게 리턴값이 없이 main 함수를 선언한다.

		Scanner in = new Scanner(System.in);
		// Scanner 객체 in를 선언한다.
 
		int n = in.nextInt();
		// int형 변수 n를 선언하고 값을 입력받아 저장한다.
		int count = 1;
		// int 형 변수 count를 선언하고 값 1를 저장한다.
		int range = 2; 
		// int 형 변수 range를 선언하고 값 2를 저장한다.

		if (n == 1) {
		// 변수 n의 값이 1일때 괄호 안의 문장이 실행된다.
			System.out.print(1);
			// 1를 출력한다.
		}
 
		else {
			while (range <= n) {
			// 변수 range에 저장된 값이 변수 n에 저장된 값 이하일때 while문이 실행된다.
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
			// count 값을 출력한다.
		}
	}
}