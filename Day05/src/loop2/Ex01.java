package loop2;

public class Ex01 {
	public static void main(String[] args) {
		
		for (int i= 1; i <= 3; i++) {		// 바깥 for : 행 반복
			for (int j = 1; j <=5; j++) {	// 안쪽 for : 열 반복
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
}
