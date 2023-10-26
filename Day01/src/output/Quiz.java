package output;


public class Quiz {
	public static void main(String[] args) {
		System.out.println("이름 : 홍길동 (24세)");
		System.out.println("신장 : 176.3cm");
		System.out.println("주소: 부산광역시 해운대구 센텀");
		
		System.out.println();
		
		System.out.printf("이름 : %s (%d)세\n", "홍길동", 24);
		System.out.printf("신장 : %.1fcm\n", 176.3);
		System.out.printf("주소: %s", "부산광역시 해운대구 센텀");
		
	}
}
