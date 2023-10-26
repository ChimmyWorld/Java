package _switch;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, sum;
		double avg;
		
		System.out.println("국, 영, 수 점수 입력: ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		avg = (kor + eng + mat) / 3.0;
		
		int tmp = (int)(avg /10 );
		
		System.out.println("합계 : " +  sum );
		System.out.printf("평균 : %.1f\n", avg );
		
		switch (tmp) {
		case 10: case 9: 			System.out.println("등급 : A"); break;
		case 8: 					System.out.println("등급 : B"); break;
		case 7: 					System.out.println("등급 : C"); break;
		case 6: 					System.out.println("등급 : D"); break;
		default:					System.out.println("등급 :F");
		}
		
		
		sc.close();
	}
}
