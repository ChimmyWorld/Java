package input;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1;
		
		System.out.println("띄어쓰기 포함 입력: ");
		//str1 = sc.next();
		str1 = sc.nextLine();
		
		System.out.println("str1 = " + str1);
		
		sc.close();
	}
}
