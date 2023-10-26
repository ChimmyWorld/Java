package variable;

public class Quiz {
	public static void main (String[] args) {
		char gender = '남';
		String name = "홍길동";
		String address = "부산광역시 해운대구 센텀로";
		int age = 23;
		double height = 167.9;
		
		System.out.println("이름 : " + name + "(" + age + "세, " + gender + ")");
		System.out.println("신장 : " + height + "cm");
		System.out.println("주소 : " + address);
		
		System.out.println();
		
		System.out.printf("이름 : %s (%d세, %c)\n", name, age, gender);
		System.out.printf("신장 : %.1fcm\n", height);
		System.out.printf("주소 : %s\n", address);
	}
	
}
