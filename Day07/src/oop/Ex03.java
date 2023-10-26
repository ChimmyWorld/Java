package oop;

// class Person{
//	클래스는 같은 패키지에서 공유 된다
//}

public class Ex03 {
	public static void main(String[] args) {
		//클래스가 정의되어 있으면 인스턴스는 몇개든 생성할 수 있다
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "홍길동";
		p2.name = "김민수";
		
		p1.run(); // run(p1)
		p2.run(); // run(p2)
	}
}
