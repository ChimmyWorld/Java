package other;

public class Person {
	protected String name;
	protected int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void eat(String food) {
		System.out.printf("%s이(가) %s(을)를 먹습니다.\n", name, food);
	}
	
	public void showInfo() {
		System.out.printf("%s (%d)세", name, age);
	}
	
	public String getName() {
		return name;
	}
	
	
}
