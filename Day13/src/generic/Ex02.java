package generic;

class Box<T>{			// 인스턴스 생성시 전달한 타입으로 지정하게 된다
	private T value; 
	
	Box(T value){
		this.value = value;
	}

	T getValue() {
		return value;
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>(10);
		// 정수를 저장하는 박스를 만들어 달라
		Box<String> b2 = new Box<String>("Java");
		// 문자열을 저장하는 박스를 만들어 달라
		
		Box<Person> b3 = new Box<Person>(new Person("홍길동", 30));
		
		System.out.println("b1 값 :" + b1.getValue());
		System.out.println("b2 값 :" + b2.getValue());
		System.out.println("b3 값 :" + b3.getValue().getName());
	}
}
