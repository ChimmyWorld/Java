package loop;

public class Quiz03 {
	public static void main(String[] args) {
		int money = 1;
		int total = 0;
		
		for (int day = 1; day <=30; day ++) {
			total += money;
			// System.out.println(day + "일) 예금: " + money + ", 총액: " + total );
			money *= 2;	
		}
		
		System.out.println("총 금액: " + total + "원");
	}
}
