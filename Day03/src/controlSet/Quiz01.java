package controlSet;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();		
		if (num < 0) num = -num;
		System.out.println("입력한 정수 :" + num);
		
		sc.nextLine();
		
		System.out.println("정수 입력 ");
		int num2 = sc.nextInt();
		if (num2 % 3 == 0 & num2 % 5 == 0) System.out.println(num2 + "은 3과 5의 공배수");
		else System.out.println(num2 + "는 3과 5의 공배수가 아님");

		System.out.print("세 정수 입력");
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		int max = 0;
		
		if (max < num3) max = num3;				
		if (max < num4) max = num4;		
		if (max < num5)	max = num5;	
	
		System.out.println("가장 큰 수는 " + max);
		
		sc.close();
		
	}
}
