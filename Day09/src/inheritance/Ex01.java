package inheritance;

class Super {
	int a = 10;
	
	void superMethod() {
		System.out.println("부모 메서드입니다 \n");
	}
}

class Sub extends Super{
	int b = 20;
	
	void subMethod() {
		System.out.println("자식 메서드입니다\n");
	}
}
	

public class Ex01 {
	public static void main(String[] args) {
		Super sup = new Super();
		
		System.out.println("부모 a = " + sup.a);
		sup.superMethod();
	
		// sup.subMethod();
		// 부모는 자식의 멤버를 알 수 없다.
		
		Sub sub = new Sub();
		
		System.out.println("부모 필드 = " + sub.a);
		sub.superMethod();
		
		System.out.println("자식 필드 = " + sub.b);
		sub.subMethod();
	}
}

