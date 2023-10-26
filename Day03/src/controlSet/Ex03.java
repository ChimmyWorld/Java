package controlSet;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.println("나이 입력: ");
		age = sc.nextInt();
		
		if (age >= 20) {
			System.out.print("성인");
		}
		
		if (age <= 20) {
			System.out.print("미성년자");
		}
		
		System.out.println("입니다");
		sc.close();
	}
}
