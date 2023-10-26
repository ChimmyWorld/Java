package accessModifier;

import other.Person;

public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person("홍진호", 22, 172.2);
		
		p1.name = "홍길동";
//		p1.age = 30;			//package는 다른 패키지에서 참조 불가
//		p1.height = 175.3;		//private는 클래스 외부에서 참조 불가
		
		p1.showInfo();
// 		직접 제어는 불가능하지만, 위와 같이 간접 제어를 할 수 있다.
	}
}
