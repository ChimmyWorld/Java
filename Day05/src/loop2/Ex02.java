package loop2;

public class Ex02 {
	public static void main(String[] args) {
		int n = 2;
		
		for (int i = 1; i<=9; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
		
		System.out.println();
		
		for (int i = 2; i<=9; i++) {
			for (int j = 1; j<=9; j++) {
			System.out.print(i + " * " + j + " = " + i * j + " / ");
			}
			
			System.out.println();
		}
	}
}
