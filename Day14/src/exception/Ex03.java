package exception;

public class Ex03 {
	// main에서까지 예외를 전가하면 JVM이 받아서 처리(예외 발생시 프로그램 종료)+
	public static void main(String[] args) throws InterruptedException {
		
		//1. try ~ catch 사용시
		// 저 sleep() 메서드는 예외가 발생할 일이 사실 별로 없다
		// 그러나 예외처리를 하지 않으면 컴파일 에러가 발생
		for (int i = 5; i >=1 ; i--) {
			System.out.println(i + "초");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e){}
		}
		
		//2. throws: 현재 메서드에서 발생하는 지정 예외를 모두 호출한 쪽으로 전가한다
		for (int i= 5; i>=1; i--) {
			System.out.println(i + "초");
			
			Thread.sleep(1000);
		}
		
	}
}
