package loop;

public class Ex07 {
	public static void main(String[] args) {
		//int i;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ": Hello World");
		}
		
		// System.out.println("반복 후 i = " + i);
		// i는 for문에서 생성된 지역변수
		// 따라서, for문이 끝나면 메모리에서 제거된다.
	}
}
