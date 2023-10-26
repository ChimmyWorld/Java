package input;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		int kor, eng, math;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		kor = sc.nextInt();
		
		System.out.print("영어 점수: ");
		eng = sc.nextInt();
		
		System.out.print("수학 점수: ");
		math = sc.nextInt();
		
		int sum = (kor + eng + math);
		double avg = (sum / 3.0);
		
		System.out.println("성적: 국 " + kor + " 영  " + eng + ", 수 " + math);
		System.out.printf("합계 : %d (%.1f)", sum, avg); 

		sc.close();
	}
}
