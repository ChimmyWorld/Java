package oop;

class People {
	//클래스의 필드는 초기화하지 않으면 기본값으로 초기화된다 
	String name;
	int age;
	
	People(String name, int age){
		this.name = name;	//지역변수와 필드가 이름이 겹치면 지역변수를 우선적으로 인식
		this.age = age;		//따라서, 필드를 의미하고 싶을땐 this를 붙인다
	}
	
	People(String name){
		this.name =name;
	}
	
	People(){
		name = "미정";
		age = -1;
	}
	
	void showInfo() {
		System.out.printf("%s (%d세)\n", name, age);
	}
	
	void eat(String food) {
		System.out.printf("%s(이)가 %s(을)를 먹는다\n", name, food);
	}
	
	void talkTo(People p) {
		System.out.printf("%s가 %s에게 대화를 건다\n", this.name, p.name);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		People p1 = new People("홍길동", 28);
		People p2 = new People("김민지");
		People p3 = new People();
		
		p1.showInfo();
		p1.eat("싸이버거");
		p1.eat("파전");
		System.out.println();
		
		p2.showInfo();
		p3.showInfo();
		System.out.println();
		
		p2.talkTo(p1);
		p1.talkTo(p2);
	}
}
