package quiz;

public class Seller extends Member{
	private String marketName;
	
	Seller(String id, String pw, String name) {
		super(id, pw, name);
	}

	Seller(String id, String pw, String name, String marketName){
		super(id,pw,name);
		this.marketName = marketName;
	}
	
	@Override
	public String toString() {
	return "[판매자] 아이디: " + id + " | 이름: " + name + " | 가게이름:" + marketName;
	}
	// 판매자의 객체를 불러오면 판매자 유형을 확인할 수 있고,
	// 공통 속성과 함께 가게이름이 출력된다.
}
