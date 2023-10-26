package _abstract2;

public class Ex05 {
	public static void main(String[] args) {
		
		// 익명 클래스
		USB usb1 = new USB() {

			@Override
			public void run() {
				System.out.println("USB2.0 구현~");
			}
		};
		
		usb1.run();
	
		// 람다식
		USB usb2 = () -> {
			System.out.println("USB3.0 구현~");
		};
		
		usb2.run();
	}
}
