package _switch;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		
		System.out.println("메뉴 (1~3)");
		menu = sc.nextInt();
		
		switch(menu) { 
		case 1:
			System.out.println("1번을 선택");
			break;
		case 2:
			System.out.println("2번을 선택");
			break;
		case 3:
			System.out.println("3번을 선택");
			break;
		default:
			System.out.println("부적합한 메뉴입니다");
		}
		
		System.out.println("\n프로그램 종료");
		sc.close();
		
	}
}
