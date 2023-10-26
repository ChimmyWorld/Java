package quiz;

public class Customer extends Member {
	private String address;
	
	Customer(String id, String pw, String name) {
		super(id, pw, name);
	}
	
	Customer(String id, String pw, String name, String address){
		super(id, pw, name);
		this.address = address;
	}
	
	@Override
	public String toString() {
	return "[구매자] 아이디: " + id + " | 이름: " + name + " | 주소 :" + address;
	}
	// 구매자의 객체를 불러오면 구매자 유형을 확인할 수 있고,
	// 공통 속성과 함께 주소가 출력된다.
	
	
}
