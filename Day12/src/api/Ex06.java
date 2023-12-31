package api;

import java.util.Random;

public class Ex06 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		// 1. 0 ~ 9 까지
		for (int i = 0; i <10; i++) {
			int n = ran.nextInt(10); // nextInt(n) : 0 ~ (n-1) 사이의 무작위 정수를 반환
			
			System.out.print(n + " ");
		}
		System.out.println();
		
		// 2. 1 ~ 10 까지
		for (int i =0; i <10; i++) {
			int n = ran.nextInt(10) + 1;	// (0 ~ 9) + 1
											// 즉, 1 ~ 10
			System.out.print(n + " ");
		}
		System.out.println();
		
		// 3. 5 ~ 15 까지
		for (int i =0; i <10; i++) {
			int n = ran.nextInt(10) + 5;
			
			System.out.print(n + " ");
		}
		System.out.println();
		
	}
}
