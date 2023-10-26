package input;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int n = sc.nextInt();
		
		System.out.println("입력한 값은 " + n);
		
		sc.close(); 
	}
}
