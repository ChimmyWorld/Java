package loop;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int count = 0;
		System.out.println("정수 입력: ");
		int input = sc.nextInt();
		
		while(true) {
			count++;
			if (count > input) {
				break;
			}
			sum += count;
		}
		System.out.println(sum);
	}
}
