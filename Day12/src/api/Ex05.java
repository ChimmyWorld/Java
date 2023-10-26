package api;

public class Ex05 {
	public static void main(String[] args) {
		// Java의 랜덤은 두가지로 제공된다
		// 1. Math의 random 메서드
		// 2. Random 클래스
		

		for (int i = 0 ; i < 10 ; i++) {
		int ran = (int) (Math.random() * 100) % 16 + 5;
		// 1. n % 16 --> 0 ~ 15의 나머지
		// 2. n % 16 + 5 --> (0 ~ 15) + 5
		// 즉, 5 ~ 20
	
		System.out.println("ran = " + ran);
		}
		
	}
}
