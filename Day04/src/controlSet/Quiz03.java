package controlSet;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time = 2;
		
		System.out.print("정거장 수: ");
		int station = sc.nextInt();
				
		if (station >= 10) time = 4;
		
		int total = time * station;
		int hour;
		
		if (total >= 60) {
			hour = total / 60;
			total = total % 60;
			System.out.println("총 소요시간은 " + hour + "시간" + total + "분입니다.");
		}
		
		else System.out.println("총 소요시간은 " + total + "분입니다.");
		
		sc.close();
	}
}
