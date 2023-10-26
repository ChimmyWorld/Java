package other;

/*
	 인터페이스 (interface)
	 - 아무것도 구현되지 않은 껍데기 클래스
	 - 자바에서 다중상속이 가능한 타입 (extends는 다중상속이 불가능)
	 - 필드는 public static final 속성이 되고
	 - 메서드는 public abstract가 된다
*/

public interface FlyAble {
	String type = "날개";
	
//	(public abstract 생략) void fly() {
//	};
	//Abstract methods do not specify a body
	
	void fly();
}
