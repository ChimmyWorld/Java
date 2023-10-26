package method;

public class Ex05 {
	
	// void형
	static void adder1(int n1, int n2) {
		int sum = n1 + n2;
		
		System.out.printf("%d + %d = %d\n", n1, n2, sum);
	}
	
	// int형
	static int adder2(int n1, int n2) {
		int sum = n1+n2;
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		adder1(5, 6);			// void형은 실행만 하기 때문에 이름만 작성해서 사용
		
//		int m = adder1(5, 6);
//		Type mismatch: cannot convert from void to int
		
		int n = adder2(5, 6);	// 반환형 메서드는 결과값을 돌려주기 때문에
//		int n = 11				// 1. 변수에 저장받거나 
		
		System.out.println("n = " + n);
		System.out.println("adder2(3, 1) = " + adder2(3,1));
//		System.out.println("adder2(3, 1) = " + 4));	 //2. 다른 메서드의 전달값으로 바로 사용한다. 
		
		// 연습
		int result = adder2(adder2(7,1), adder2(3,8));
		// 8 + 11 = 19
		System.out.println("result = " + result);
		
	}
}
