package loop;

public class Ex01 {
	public static void main(String[] args) {
		int i = 1; 			// 초기값
		
		while (i <= 5) { 	// 조건식
			System.out.println(i + ": Hello World");
			i++;			// 증감식
		}
		
		System.out.println("반복 후 i = " + i + "\n");
		
		i = 5;
		
		while (i >= 1) {
			System.out.println(i + ": Hello World");
			i--;
		}
		
		System.out.println("반복 후 i = " + i + "\n");
		
		
	}
}
