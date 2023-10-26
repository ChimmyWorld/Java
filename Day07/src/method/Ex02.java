package method;

public class Ex02 {
	
	static void func(int n) {
		if (n ==0) return;
		
		System.out.print(n + " ");	
		
		func(n -1 );
		
		System.out.print(n + " ");
	}
	
	public static void main(String[] args) {
		// 반복: 편도
		for (int i = 3; i >=1; i --) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 재귀: 왕복
		func(3);
	}
}
