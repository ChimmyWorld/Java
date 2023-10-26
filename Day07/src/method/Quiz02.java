package method;

public class Quiz02 {
	
	static int fibo(int n) {
		if (n <= 2) {
			return 1;
		}
		
		return fibo(n-1) + fibo(n-2);
	}
	
	public static void main(String[] args) {
		System.out.println("3번째 fibo = " + fibo(3)); // 2
		
		System.out.println("9번째 fibo = " + fibo(9)); // 34
		System.out.println("40번째 fibo = " + fibo(40));
	}
}
