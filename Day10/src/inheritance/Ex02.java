package inheritance;

import other.Person;

class Police extends Person{
	private String rank;

	Police(String name, int age, String rank){
		super(name, age);
		this.rank = rank;
	}
	
	@Override
	public void showInfo() {
		System.out.printf("이름: %s, 나이 : %d, 계급: %s\n", name, age, rank);
	}
	
	void patrol(String site) {
		System.out.printf("%s %s이(가) %s을(를) 순찰합니다\n", rank, name, site);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Police pol = new Police("김수빈", 30, "순경");
		
		pol.showInfo();
		pol.eat("빵");
		pol.patrol("센텀시티");
	}
}
