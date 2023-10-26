package accessModifier;

class Human{
	private String name;
	
	Human(String name){
		this.name = name;
	}
	
	String getName() {
		return name;
	}
}

class Car {
	private String model;
	private int speed;
	
	Car(String model){
		this.model = model;
	}
	
	private int n = 4; 					 //좌석 수
	private Human[] sits = new Human[n]; // 좌석
	
	void rideOn(Human human, int num) {
		if (num  >= n || num < 0) {
			System.out.println("존재하지 않는 좌석입니다.");
			return;
		}
		
		if (sits[num] != null) {
			System.out.println("좌석에 이미 사람이 타고 있습니다.");
			return;
		}
		
		sits[num] = human;
		
	}
	
	void showCar() {
		System.out.printf("%s, %dkm/h\n", model, speed);
		for (int i =0; i< sits.length; i++) {
			if (sits[i] == null) {
				System.out.println(i + "번째 :" + "없음");
			}
			else {
			System.out.println(i + "번째 :" + sits[i].getName());
			}
		}
	}
	
	void accel(int speed) {
		if (sits[0] == null) {
			System.out.println("가속 불가");
			return;
		}

		this.speed += speed;

		
		showCar();
	}
	
	void break_(int speed) {
		if(sits[0] == null) {
			System.out.println("감속 불가");
			return;
		}
		
		this.speed -= speed;
	}
	void rideOff(int num) {
		if (speed != 0) {
			System.out.println("하차 불가, 정차를 해주세요");
			return;
		}
		
		sits[num] = null;
	}
	
}

public class Quiz02 {
	public static void main(String[] args) {
		Car car = new Car("아우디");
		Car car2 = new Car("람보르기니");
		
		Human h1 = new Human("홍길동");
		Human h2 = new Human("김영석");
		Human h3 = new Human("잼민이");
		car.rideOn(h1, 0); 				// 자동차에 사람이 탑승, 지정한 자리(0)에 탑승 시킨다 
										// 이미 좌석에 사람이 있다면 경고 출력
		car.rideOn(h2, 0);
		car.rideOn(h3, 2);
		car.rideOn(h2, 4);
		
		car.showCar(); 					// 모델명 / 속도 / 탑승자 출력
		
		car.accel(30);					// 가속 메서드, 운전자가 없으면 가속 불가
		
		car.break_(30);
		car.rideOff(2);
		
		car.showCar();
	}
}
