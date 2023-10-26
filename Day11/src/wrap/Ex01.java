package wrap;

public class Ex01 {
	public static void main(String[] args) {
		int n1 = 10;
		Integer n2 = 20;
		Integer n3 = new Integer(30);
		
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3 + "\n");
		
		System.out.println("n1 + n2 = " + (n1 + n2));
		System.out.println("n1 < n3 결과: " + (n1 < n3));
		// Integer가 int를 완전 대체할 수는 있지만 int가 훨씬 가볍다
		// 따라서 Integer의 기능이 딱히 필요없으면 int가 성능상 유리하다.
		
		// Wrapper는 해당 자료형에 몇몇 기능을 제공한다
		System.out.println("65의 2진수: " + Integer.toBinaryString(65));
		System.out.println("62의 8진수: " + Integer.toOctalString(65));
		System.out.println("65의 16진수: " + Integer.toHexString(65));
	}
}
