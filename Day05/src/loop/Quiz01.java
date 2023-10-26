package loop;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력");
		int n = sc.nextInt();
		
		for (int i =1; i <= n; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		int count =0;
		
		for (int i=1; i<=n; i++) if (n % i == 0) count++;
		
		if (count == 2)	System.out.println("소수입니다");
		else 			System.out.println("소수 아님");
	}
}
