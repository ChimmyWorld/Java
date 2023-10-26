package quiz;

import java.io.IOException;

public class Main {
	// 학생 정보 관리 프로그램
	// 1. 학생 정보를 저장할 클래스 (필드는 이름, 국 영 수)
	// 2. 메뉴 관리와 실제 학생 정보를 처리할 Controller 클래스
	public static void main(String[] args) throws IOException {
		
		Controller con = new Controller();
		con.run();
		
	}
	
}
