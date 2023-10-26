package socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class QuizClient {
	public static void main(String[] args) throws IOException{
		Socket socket = new Socket("192.168.113.176", 10000);
		System.out.println("서버에 연결됨");
		
		// 1. 서버로 출력(writer), 서버로 부터 입력(scanner)
		PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
		Scanner input = new Scanner(socket.getInputStream());
				
		// 2. 내 콘솔창에서 입력(Scanner)
		Scanner sc = new Scanner(System.in);
		String msg;
		
		// 3. 입력 스레드 생성
		Thread receive = new Thread(() -> {
				while(input.hasNextLine()) {
					System.out.println("입력받은 데이터: " + input.nextLine());
				}
		});
		
		receive.start();
		
		// 출력코드
		while(true) {
			System.out.print("입력(0 : 종료)");
			msg = sc.nextLine();
			
			if("0".equals(msg)) {break;}
			output.println(msg);
			
		}
		
		sc.close();
		socket.close();
		System.out.println("\n 연결이 종료되었습니다");
	}
}
