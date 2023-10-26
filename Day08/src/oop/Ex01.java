package oop;

class Unit {
	String name;
	int atk, hp;
	
	public Unit(String name, int atk, int hp) {
		this.name = name;
		this.atk = atk;
		this.hp = hp;
	}
	
	void showInfo() {
		System.out.printf("%s (atk %d, hp %d)\n", this.name, this.atk, this.hp);

	}
	
	void attack(Unit tar) {
		tar.hp -= atk;
		
		System.out.printf("\n%s(이)가 %s(을) 공격!!!\n", this.name, tar.name);
		System.out.println(atk  + "만큼의 피해를 줬다");
		tar.showInfo();
	}
	
	
}

public class Ex01 {
	public static void main(String[] args) {
		Unit war = new Unit("전사", 10, 100);
		Unit wiz = new Unit("마법사", 15, 70);
		
		war.showInfo(); 	// 전사(atk 10, hp 100)
		wiz.showInfo();		// 마법사(atk 15, hp 70)
	
		// 상호작용: 객체간에 발생하는 동작/행위를 의미
		war.attack(wiz);
		wiz.attack(war);

	}
	
}
