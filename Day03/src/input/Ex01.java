package input;

import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		int n;
		
		n = System.in.read();
		// System.in: 표준 입력 객체
		
		System.out.println("n = " + (char)n);
	}
}
