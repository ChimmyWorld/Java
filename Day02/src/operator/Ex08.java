package operator;

public class Ex08 {
	public static void main(String[] args) {
		int n = 10 ;
		
		String isPos = (n >= 0) ? "양수" : "음수";
//		String isPos = "양수"; (n = 10일때)
//		String isPos = "음수"; (n = -10일때)
		
		System.out.println(n + "은(는) " + isPos);
	}	
	
}
