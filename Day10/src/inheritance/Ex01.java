package inheritance;

import other.Person;

class Student extends Person{
	private int score;
	Student(String name, int age, int score){
		super(name, age);
		this.score = score;
	}
	
	@Override
	public void showInfo(){
		System.out.printf("이름 : %s, 나이: %d, 점수: %d\n", name, age, score );
	}
	
	void study(String subject) {
		System.out.printf("%s이(가) %s을(를) 공부합니다.\n", name, subject);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		//아래 클래스를 구현
		// 단, other.Person을 상속받는다
		Student stu = new Student("홍길동", 15, 50);
		
		stu.eat("라면");
		stu.showInfo();
		stu.study("Java");
	}
}
