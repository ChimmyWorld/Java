package oop;

class Car{
	String name;
	int speed;
	
	Car(String name, int speed) {
			this.name = name;
			this.speed = speed;
	}
	
	void accel(int speed) {
		this.speed += speed;
		System.out.printf("%d km/h 가속\n", speed);
	}
	
	void break_(int speed) {
		this.speed -= speed;
		System.out.printf("%d km/h 감속\n", speed);
	}
	
	void showCar(){
		System.out.printf("%s (%d km/h)\n", this.name, this.speed );
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		Car car = new Car("모닝", 0);
		
		car.showCar();	// 모닝 (0 km/h)
		
		car.accel(30);	
		car.showCar();
		
		car.accel(20);
		car.showCar();
		
		car.break_(15);
		car.showCar();
	}
}
