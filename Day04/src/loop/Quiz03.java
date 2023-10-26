package loop;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;
		int count   = 0;
		int multsum = 1;
		
		System.out.println("정수 입력: ");
		input = sc.nextInt();
		
		while (true) {
			
			multsum = count * input;
			count++;
			if (count >= input) {
				break;
			}
		}	
		
		System.out.println("합계: " + multsum);
	}
}
	
