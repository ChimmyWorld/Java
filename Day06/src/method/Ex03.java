package method;

public class Ex03 {
	static void adder(int n1, int n2) {
		int sum = n1 + n2;
		
		System.out.print("n1: " + n1 + " n2: " + n2 + "\n");
		System.out.printf("n1 + n2 = %d\n", sum );
	}
	
	public static void main(String[] args) {
		adder(10, 20);
		adder(20, 10);
		
		//adder(10);		// 개수 불일치
		//adder(10, 20.0);  // 자료형 불일치
	}
}
