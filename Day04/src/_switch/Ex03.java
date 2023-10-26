package _switch;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu;
		
		System.out.println("----------- 메뉴 --------------");
		System.out.println("\t 1. 짜장면");
		System.out.println("\t 2. 짬뽕");
		System.out.println("\t 3. 돈까스");
		System.out.println("\t 4. 볶음밥");
		System.out.print(">>> ");
		menu = sc.next();
		
		switch(menu) {
		case "짜장면":case "1": 
			System.out.println("짜장면 주문이요~");
			break;
		case "짬뽕": case "2":
			System.out.println("짬뽕 주문이요~");
			break;
		case "돈까스": case "3":
			System.out.println("돈까스 주문이요~");
			break;
		case "볶음밥": case "4":
			System.out.println("볶음밥 주문이요~");
			break;
		default:
			System.out.println("없는 메뉴입니다");
		}
		sc.close();
	}
}
