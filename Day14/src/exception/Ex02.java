package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		int[] arr = new int[] {10,20,30,40,50};
		
		try {
			System.out.println("정수: ");
			n = sc.nextInt();
			
			System.out.println("n = " + n );
			System.out.println("10 / n = " + 10 / n);
			System.out.println("arr[" + n + "] = " + arr[n]);
			
		} catch(InputMismatchException e) {
			System.err.println("예외: 정수가 아닙니다");
		} catch(ArithmeticException e) {
			System.err.println("예외 :" + e.getMessage());
		} catch(Exception e) {
			// Exception: 예외의 최상위 클래스
			e.printStackTrace();
			return;
		} finally { // 예외 발생 여부에 관계없이 '무조건' 실행
					// 주로 할당받은 자원을 해제하는 코드가 자주 사용됨
			System.out.println("\n스캐너 해제");
			sc.close();
		}
	}
}
