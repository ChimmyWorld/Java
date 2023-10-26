package inheritance;

import java.util.Scanner;

public class Quiz04 {
	static String[] ids = new String[] { "itbank", "root", "user"};
	static String[] pws = new String[] { "it", "qwe", "1234"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 입력: ");
		String userid = sc.next();
		
		System.out.println("패스워드 입력: ");
		String userpw = sc.next();
		
		for (int i = 0; i < ids.length; i++) {
			if (userid.equals(ids[i])){
				if (userpw.equals(pws[i])){
				System.out.println("로그인 성공");
				return;
				}
			}
		}
		System.out.println("로그인 실패");
		
		sc.close();
	}
}