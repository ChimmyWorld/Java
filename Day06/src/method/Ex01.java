package method;

public class Ex01 {
	
	// 메서드 선언: 실행할 코드를 저장한 곳
	static void hello() {
		for (int i=1; i<=5; i++) {
			System.out.println(i + ": Hello World");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		hello();	// 메서드 호출: 선언해놓은 메서드를 사용하는 것
		hello();	// 메서드의 재사용성: 한번 선언한 메서드는 몇번이건 사용 가능
		hello();		
		
	}
}
