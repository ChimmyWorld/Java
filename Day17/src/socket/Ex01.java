package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSk = new ServerSocket(10000);
		
		System.out.println("서버 On. 연결 대기 중...");
		Socket clientSk = serverSk.accept();
		
		System.out.println("클라이언트 연결!!!");
		System.out.println("접속 ip: " + clientSk.getInetAddress());
		System.out.println("접속 port: " + clientSk.getPort());
		
		serverSk.close();
		clientSk.close();
		System.out.println("\n접속이 종료되었습니다.");
		
		
	}
	
}
