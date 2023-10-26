package inheritance;

import other.Person;

class Airplane{
	private Person[] sits = new Person[3];
	
	public void rideOn(Person per) {
		for (int i=0; i<sits.length; i++) {
			if(sits[i] == null) {
				sits[i] = per;
				System.out.printf("%s이 탑승\n", per.getName());
				return;
			}
		}
		System.out.println("자리가 없습니다.");
	}
	
	public void list() {		
		for(int i=0; i<sits.length; i++) {
		System.out.print(i + 1 + "번 좌석: ");
		
		if(sits[i] != null) sits[i].showInfo();
		else System.out.println("빈 좌석\n");
		}
	}
	
	public void emergency(Person per) {
		for(int i=0; i<sits.length; i++) {	
			if (sits[i] instanceof Doctor == true) {
				Doctor tmp = (Doctor)sits[i];
				// 좌석의 Person을 Doctor로 다운캐스팅
				tmp.cure(per);
				return;
			}			
		}
		System.out.println("\n의사가 없습니다.");
	}
}

public class Quiz02 {
	public static void main(String[] args) {
		Student stu = new Student("홍길동", 19, 93);
		Police pol = new Police("이민철", 29, "경정");
		Doctor doc = new Doctor("이국종", 43, "내과");
		Person per = new Person("박수진", 30);
		Student stu2 = new Student("박망키", 19, 95);
		Student stu3 = new Student("김멍키", 20, 99);
		Student stu4 = new Student("최멍구", 21, 100);
		
		Airplane air = new Airplane();
		
		air.rideOn(stu); // 비행기에 '사람'이 탑승하는 메서드
		air.rideOn(pol); // 좌석이 부족하면 탑승 불가능
		air.rideOn(doc);
		air.rideOn(per);
		air.rideOn(stu2);
		air.rideOn(stu3);
		air.rideOn(stu4);
		
		air.list();		 // 탑승객 목록을 출력
		
		air.emergency(stu);
	}
}
