package oop;

class Person{
	String name;
	
	Person(String name){
		this.name = name;
	}
}
class Car{
	String model;
	int speed;
	Person driver;
	
	Car(String model){
		this.model = model;
	}

	void showCar() {
		String name = (this.driver == null) ? "X" : driver.name;
		System.out.printf("%s (%dkm/h), %s\n", model, speed, name);
	}
	
	void accel(int speed) {
		if (this.driver == null) {
			System.out.println("운전자가 없습니다.");
		}
		else {
			this.speed += speed;
			System.out.printf("%dkm/h 가속\n", speed);
			showCar();
		}
	}
	
	void takeOn(Person driver) {
		this.driver = driver;
		System.out.printf("%s(이)가 %s에 탑승\n", driver.name, this.model);
	}
	
	void break_(int speed) {
		this.speed -= speed;
		System.out.printf("%dkm/h 감속\n", speed);
	}
	
	void takeOff() {
		if (speed != 0) {
			System.out.println("\n정차 후 하차해 주세요");
			return;
		}
		System.out.printf("%s님이 하차\n", driver.name);
		driver =null;
		
		showCar();
	}
}

public class Ex03 {
	public static void main(String[] args) {
		//아래 코드가 동작하게 클래스를 구현
		Person hong = new Person("홍길동");	//필드: 이름
		Car car = new Car("모닝");			//필드: 모델명, 속도, 운전자(=사람)

		car.showCar(); 						// 모닝 (0km/h, x)
		
		car.accel(30);						// 가속 메서드 | 단, 운전자가 없으면 동작 X
	
		car.takeOn(hong);					// 자동차에 사람을 탑승시키는 메서드
											// 홍길동(이)가 모닝에 탑승
	
		car.showCar();						// 모닝 (0km/h, 홍길동)

		car.accel(30);						// 30km/h가속
											// 모닝 (30km/h, 홍길동)
		
		car.break_(20);						// 20km/h 감속
											// 모닝 (10km/h, 홍길동)

		car.takeOff();						// 운전자가 하차하는 메서드
											// 단, 속도가 0이 아니면 하차 불가능
		
		car.break_(10);
		
		car.takeOff();
	}

}
