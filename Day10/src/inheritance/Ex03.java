package inheritance;

import other.Person;

public class Ex03 {
	public static void main(String[] args) {
		Student stu = new Student("김수진", 17, 85);
		
		// 업 캐스팅: 자식 인스턴스를 부모로 참조
		Person per1 = stu;
		Person per2 = new Police("박철수", 37, "경감");
		
		//특징 1. 부모의 멤버는 그대로 사용 가능
		per1.showInfo();
		per2.showInfo();
		
		//특징 2. 원래 자식의 멤버는 사용 불가능	
	    //per1.study("Python");
	    //per2.patrol("해운대구");
		
		// 다운 캐스팅: 업 캐스팅된 인스턴스를 다시 '원래 타입'으로 참조
		Student tmp = (Student) per1;
		
		// 특징 1. 원래 자식의 멤버를 다시 참조할 수 있게 된다.
		tmp.study("Spring");
		
		((Police)per2).patrol("해운대구");
		
		// 특징 2. 원래 타입과 다른 타입으로 변환하면 에러
		Student tmp2 = (Student)per2;
	
		
	}
}
