package input;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name = sc.next();
		
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		
		System.out.print("신장 입력: ");
		float height = sc.nextFloat();
		
		System.out.print("성별 입력: ");
		char gender = sc.next().charAt(0);
		
		System.out.println("이름 : " + name + "(" + age + "세," + gender + ")");
		System.out.println("신장 : " + height + "cm");
		
		sc.close();
	}
}
