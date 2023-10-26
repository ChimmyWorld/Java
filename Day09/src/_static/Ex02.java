package _static;

import java.io.ObjectInputStream.GetField;

class People {
	private String name;
	private int age;
	
	private static int eyes =2;
	
	People(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void showInfo() {
		String msg = "%s (%d세, 눈%d개)\n";
		System.out.printf(msg, name, age, eyes);
	}
	
	static int getEyes() {
		//age = 30;
		//정적 멤버는 일반멤버를 참조할 수 없다.
		return eyes;
	}
	
	static void setEyes(int eyes) {
	//	this.eyes = eyes;
	//	정적 메서드에서는 this가 없다
	// 	this은 원래 인스턴스 구분을 위해 사용
		People.eyes = eyes;
		
	}
	
	
	
}

public class Ex02 {
	public static void main(String[] args) {
		// 정적멤버는 인스턴스가 없어도 사용가능
		// 클래스 자체의 멤버이므로 클래스만 있으면 바로 사용 가능
		
		System.out.println("사람의 눈 개수 : " + People.getEyes());
		
		People p1 = new People("코기", 22);
		People p2 = new People("바소기", 23);
		People p3 = new People("저기", 29);
		
		People.setEyes(3);
		
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
	}
}
