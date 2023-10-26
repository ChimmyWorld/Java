package loop;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rev = 0;
		int input;
		
		System.out.println("정수 입력: ");
		input = sc.nextInt();
		
		while (input !=0) {
			rev = rev * 10 + input % 10 ; 
			input /= 10;
		}
		
		System.out.println("rev = " + rev);
		sc.close();
		
	}
}
