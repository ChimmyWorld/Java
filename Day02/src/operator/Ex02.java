package operator;

public class Ex02 {
	public static void main(String[] args) {
		int n = 10;
		System.out.println("n + 3 = " + (n + 3));
//		System.out.println("n - 3 = " + n - 3);
		System.out.println("n - 3 = " + (n - 3));
		System.out.println("n * 3 = " + n * 3);
		System.out.println("n / 3 = " + n / 3);
		System.out.println("n % 3 = " + n % 3);
		
		//나눈 후 소수점(= 실수)의 결과를 얻으려면?
		System.out.println("n / 3.0 = " + n / 3.0);
		
		// 강제 형 변환: 지정 데이터 앞에 자료형을 명시해서 변환 
		int m = 3;
		System.out.println("n / m =" + n / m);
		System.out.println("n / m = " + n / (double)m);
		
		System.out.println("m = " + m );
		// 강제 형변환은 일시적이다
	}
}
