package other;

public class Person {
	public String name;
	int age;
	private double height;
	
	public Person(String name, int age, double height){
	//public을 작성하지 않으면 마찬가지로 package 속성이 되어 참조할 수 없음
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void showInfo() {
		System.out.printf("%s (%d세, %.1fcm)\n", name, age, height);
		
	}
	
}
