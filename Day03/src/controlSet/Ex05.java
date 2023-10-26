package controlSet;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		if (n % 2 == 0 ) {
			System.out.println("짝수");
			
			if (n % 3 == 0) {
				System.out.println("짝수이며 3의 배수");
			}
			else {
				System.out.println("짝수이지만 3의 배수 아님");
			}
		}
		else {
			System.out.println("홀수");
			
			if (n % 3 == 0 ) {
				System.out.println("홀수이며 3의 배수");
			}
			
			else {
				System.out.println("홀수이지만 3의 배수 아님");
			}
		}
		
		sc.close();
		
	}
}
