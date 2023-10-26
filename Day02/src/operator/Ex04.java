package operator;

public class Ex04 {
	public static void main (String[] args) {
		int n = 10;
		
		n += 3; // n = n + 3;
		System.out.println("n = " + n);

		n -= 5;
		System.out.println("n = " + n);
		
		n *= 4;
		System.out.println("n = " + n);
		
		n /=6;
		System.out.println("n = " + n + "\n");
		
		int a = 5, b = 2, c = 4;
		
		a += b -= c /= 2;
		
		System.out.println("a " + a); // 5
		System.out.println("b " + b); // 0
		System.out.println("c " + c); // 2
	}
	
}
