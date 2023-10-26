package _abstract;

import other.Animal;
import other.FlyAble;

class Bird extends Animal implements FlyAble{
	@Override
	public void bark() {
		System.out.println("짹짹");
	}

	@Override
	public void fly() {
		//type ="윙"; 
		
		System.out.println(type + "로 날아간다");
	}
	
}

class Airplane implements FlyAble {
	@Override
	public void fly() {
		System.out.println("엔진의 가속으로 날아간다.");
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Bird bird = new Bird();
		Airplane air = new Airplane();
		
		Animal[] anis = new Animal[] {cat, dog, bird};
		for(int i=0; i<anis.length; i++) {
			anis[i].bark();			// 자식 클래스마다 다르게 실행
		}
		
		FlyAble[] flys = new FlyAble[] {bird, air};
		
		for(int i=0; i <flys.length; i++) {
			flys[i].fly();
		}
		
		// 여기서 bird를 살펴보자
		// Animal을 상속받아서 Animal로도 업캐스팅이 가능하고
		// FlyAble을 상속받아서 FlyAble로도 업캐스팅이 가능하다
		
	}
}
