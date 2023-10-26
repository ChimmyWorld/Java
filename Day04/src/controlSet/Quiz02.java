package controlSet;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int price = 5000;
		
		System.out.println("구매할 USB 개수를 입력하세요");
		int usb = sc.nextInt();
		System.out.println("구매 USB 개수: " + usb);
		
		int total = price * usb;		
		
		if (usb >= 100) 	total*=0.88; // 복합 대입 연산은 좌변의 자료형에 맞춰 계산된다 = 형변환이 필요 없다
		else if (usb >= 10) total*=0.9;
		
		System.out.println("총 가격: " + total);
		
		sc.close();
	}
}
