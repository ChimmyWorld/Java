package inheritance;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		// ID, PW를 문자열로 입력받아서 아래 정보와 동일하면 로그인 성공을 출력, 하나라도 다르면 로그인 실패
		
		Scanner sc = new Scanner(System.in);
		String id = "itbank";
		String pw = "it";
		
		System.out.println("아이디 입력: ");
		String userid = sc.next();
		
		System.out.println("비밀번호 입력: ");
		String userpw = sc.next();
		
		boolean sameId = id.equals(userid);
		boolean samePw = pw.equals(userpw);
		
		if (sameId && samePw) {
			System.out.println("로그인 성공");
		}
		
		else System.out.println("로그인 실패");
		
		sc.close();
	}
}
