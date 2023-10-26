package operator;

public class Quiz02 {
	public static void main(String[] args) {
		int a = 14;
		int b = -20;
		
		// 1. 절대값을 출력
		int abs = (a > 0) ? a : -a ;
		System.out.println("절대값: " + abs);
		
		// 2. 두 수 중 큰 수를 출력
		int max = (a > b) ? a : b;
		System.out.println("두 수 중 큰수: " + max);
		
		// 3. 짝수인지 판별
		String even = (a % 2 == 0) ? "짝수" : "짝수가 아닙니다";
		System.out.println("짝수 판별: " + even);
		
		// 4. 3과 5의 공배수인지 판별
		// String mult = (a % 15 == 0) ? "3과 5의 공배수" : "3과 5의 공배수가 아닙니다";
		//System.out.println("3과 5의 공배수 판별: " + mult);

		int n = 15;
		
		boolean result = n % 3 ==0 && n % 5 == 0;
		String mul = result ? "3과 5의 공배수" : "3과 5의 공배수 아님";
		
		System.out.printf("%d는 %s", n, mul);

	}

}
