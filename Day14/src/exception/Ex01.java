package exception;

public class Ex01 {
	public static void main(String[] args) {
		
		try {
			System.out.println(10 / 0); 
			// Exception in thread "main" java.lang.ArithmeticException: / by zero	
			
			System.out.println("여기는 예외 발생 시 실행x");
		} catch(ArithmeticException e) {
			// 예외가 발생하면 어떤 예외인지 개발자에게 알려 주면 좋다			// 아래 셋 중 하나를 골라 쓰면 된다.
			System.err.println("예외 발생 . 0으로 나누었습니다");		// 1. 직접 구문을 작성
			System.err.println("예외 발생. " + e.getMessage());	// 2. 예외 객체로 부터 예외 메시지를 받는다
			
			e.printStackTrace();								// 3. 어느 위치에서 예외가 발생했는지 주석(trace)
		}
		
		System.out.println("여기는 무조건 실행");

	}
}
