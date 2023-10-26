package oop;

class Po {
	int x, y;
	
	public Po(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	void showPo() {
		System.out.printf("(%d, %d)\n", this.x, this.y);
	}
	
	Po addPo(Po p) {
		int x = this.x + p.x;
		int y = this.y + p.y;
		
		Po sum = new Po(x,y);
		return sum;
	}
	
}

public class Quiz01 {
	public static void main(String[] args) {
		// 아래 코드가 실행되게 클래스를 구현
		Po p1 = new Po(5, 3);
		Po p2 = new Po(7, 5); 
		
		p1.showPo(); // (5, 3)
		p2.showPo(); // (7, 5)
		
		//Po p3 = p1 + p2; 직접 만든 클래스는 연산이 불가능하다. 따라서 아래와 같이 메서드를 만들어줘야 한다.
		Po p3 = p1.addPo(p2); // p1 + p2
		
		p3.showPo(); // (12, 8)
	}
}
