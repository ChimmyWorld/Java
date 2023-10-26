package thread;

class Test extends Thread {

	@Override
	public void run() { // run(): 새 쓰레드를 생성해서 실행할 코드를 작성
		for (int i = 5; i >= 1; i--) {
			System.out.println(i + "초");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}

public class Ex01 {
	public static void main(String[] args) throws InterruptedException {
		Test t1 = new Test();
		Test t2 = new Test();
		
		t1.run();	// run()을 그냥 호출하면 새 쓰레드가 생성되지 않음 
		t2.run();
		
		t1.start(); // start()는 run()을 호출하게 되어있다
		t2.start(); // 이때, 새 쓰레드를 만들면서 run() 실행
		
		for (int i = 10; i >=1; i--) {
			System.err.println(i + " : Hello~");
			Thread.sleep(1000);
		}
	}
}
