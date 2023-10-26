package operator;

public class Ex07 {
	public static void main (String[] args) {
		System.out.println("true and true 결과 : " + (true && true));
		System.out.println("true and false 결과 : " + (true && false));
		System.out.println("false and true 결과 : " + (false && true));
		System.out.println("false and false 결과 : " + (false && false));
		System.out.println();
		
		System.out.println("true or true 결과 : " + (true || true));
		System.out.println("true or false 결과 : " + (true || false));
		System.out.println("false or true 결과 : " + (false || true));
		System.out.println("false or false 결과 : " + (false || false));
		
		System.out.println("not true 결과 : " + !true);
		System.out.println("not false : " + !false);
		
		int n = -10;
		
		boolean result = n >= 0 && n <= 100; // (산술 > 비교 > 논리)
	
		System.out.println("result = " + result);
	}
}
