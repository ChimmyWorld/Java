package socket;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Thread inputTh = new Thread(() -> {
			// 여기는 입력 쓰레드
			System.out.println("입력: ");
			String msg = sc.nextLine();
		});
		
		Thread outputTh = new Thread(() -> {
			// 여기는 출력 쓰레드
			for (int i = 1; i <=10; i++) {
				System.out.println(i + "번 출력");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		});
		
		inputTh.start();
		outputTh.start();
	}
}
