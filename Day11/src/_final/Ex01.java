package _final;


public class Ex01 {
	public static void main(String[] args) {
		int n = 10;
		final int FN = 10;
		
		System.out.println("n = " + n);
		System.out.println("FN = " + FN + "\n");
	
		n = 20;
		// FN = 20; 한번 값이 지정되면 더 이상 변경이 불가능
		
		//FN += 2;  해당 공간을 변경하는 연산은 죄다 불가능
		//FN++;
		
		System.out.println("FN + 5 = " + (FN +5));
		System.out.println("FN < 20 = " + (FN <=20));
		//값을 변경하지 않는 연산은 가능
		
	}
}
