package loop;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("정수 입력(0: 종료) ");
			n = sc.nextInt();
			
			System.out.println("n = " + n + "\n");
		} while (n!=0);
		
		System.out.println("프로그램 종료");
		sc.close();
	}
}
