package thread;

class Test2 implements Runnable{

	@Override
	public void run() {
		for (int i = 5; i >= 1; i--) {
			System.out.println(i + "초");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		
		System.out.println();
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		
		Test2 test = new Test2();
		
		test.run();
		test.run();
		// 그냥 run()을 호출한 것, 새 쓰레드는 생성되지 않음
		
		Thread th1 = new Thread(test);
		Thread th2 = new Thread(test);
		// Runnable을 구현한 객체를 Thread 생성자에 전달
		
		th1.start();
		th2.start();
		// Thread 객체로 새 쓰레드를 생성
		
		System.out.println("main 끝");
		
	}
}
