package inheritance;

import java.util.Scanner;

class User {
	private String userid, userpw, nick;
	
	User(String userid, String userpw, String nick){
		this.userid = userid;
		this.userpw = userpw;
		this.nick = nick;
	}
	
	User(String userid, String userpw){
		this.userid = userid;
		this.userpw = userpw;
	}


	String getNick() {
		return nick;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		if (userpw == null) {
			if (other.userpw != null)
				return false;
		} else if (!userpw.equals(other.userpw))
			return false;
		return true;
	}
	
}


public class Quiz01 {
	
	static User[] dbs = new User[] {
			new User("itbank", "it", "아뱅"),
			new User("root", "qwe", "관리자"),
			new User("user", "1234", "유저")
	};
	
	static User login(User user) {
		for(int i= 0; i<dbs.length; i++) {
			if (dbs[i].equals(user)) {
				return dbs[i];
			}
		}	
			return null;
	}
		
		
	
	public static void main(String[] args) {
		// 이번엔 계정 정보를 클래스로 구현해서 로그인을 구현
		Scanner sc = new Scanner(System.in);
		String userid, userpw;
		
		System.out.println("아이디 입력: ");
		userid = sc.next();
		
		System.out.println("비밀번호 입력:");
		userpw = sc.next();
		
		User user = new User(userid, userpw);
		user = login(user);
		
		String msg = "로그인 실패";
		
		if (user != null) {
			msg = user.getNick() +"님 로그인";
		}
		
		System.out.println(msg);
		
		sc.close();
	
	}
}

