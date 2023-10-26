package loop;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		int input;
		
		System.out.print("정수 입력: ");
		input = sc.nextInt();
		
		while (true) {
			System.out.println(num);
			if (num >= input) break;
			num ++;
		}

	}
}
