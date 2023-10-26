package operator;

public class Ex06 {
	public static void main(String[] args) {
		int n = 10;
		
		System.out.println("n > 10 결과 : " + (n > 10));
		System.out.println("n >= 10 결과 : " + (n >= 10));
		System.out.println("n < 20 결과 : " + (n < 20));
		System.out.println("n <= 20 결과 : " + (n <= 20));
		System.out.println("n == 10 결과 : " + (n == 10));
		System.out.println("n != 결과 : " + (n != 10));
		
		boolean result = (n == 11);
		System.out.println(result);
	}
	
}
