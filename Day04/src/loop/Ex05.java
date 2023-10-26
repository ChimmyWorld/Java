package loop;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		while (true) {
			System.out.println("정수 입력(0: 종료) ");
			n = sc.nextInt();
			
			if (n==0) { // if문은 break의 영향을 받지 않는다. (while에 적용됨) 조건을 걸어주기 위해 작성
				break;
			}
			
			System.out.println("n = " + n + "\n");
		}
		
		System.out.println("프로그램 종료");
		sc.close();
	}
}
