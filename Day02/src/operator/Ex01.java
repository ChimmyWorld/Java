package operator;

// 연산자

public class Ex01 {
	public static void main(String[] args) {
		int n = 10;
		System.out.println(n + 5);
//		System.out.println(10 + 5);
		
		System.out.println(n);
// 		산술 연산은 그 자리에서만 연산되고 변수에 변화를 주지 않음		
		
		System.out.println("n + 5 = " + n + 5);
		System.out.println("n + 5 = " + (n+5));
		System.out.println(n + 5 + " = n + 5 ");
	}
}
