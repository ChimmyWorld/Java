package operator;

public class Ex03 {
	public static void main(String[] args) {
		int n = 10 + 3;
//		int n = 13;
		
		System.out.println("n= " + n);
		
		int a, b, c;
		// int a, b, c = 10; -> c만 10으로 초기화 된다.

		a = b = c = 10; // 가장 우변부터 수행
		System.out.println("a = " + a );
		System.out.println("b = " + b );
		System.out.println("c = " + c );
	}
}
