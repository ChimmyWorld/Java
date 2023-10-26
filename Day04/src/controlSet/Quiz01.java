package controlSet;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 영어 수학 점수를 각각 입력해주세요.");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		double avg = (sum/3.0);
		System.out.printf("합계 : %d, 평균 : %.1f\n", sum, avg);
		
		char rank = 'A';
		
		if (avg >= 90) {}
		else if (avg >= 80) rank = 'B';
		else if (avg >= 70) rank = 'C';
		else if (avg >= 60) rank = 'D';
		else 				rank = 'F';
		
		System.out.println("등급: " + rank);
		
		sc.close();
	}
		
}
