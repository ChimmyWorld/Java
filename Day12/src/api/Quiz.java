package api;

import java.util.Random;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// Up / Down 게임 구현
		// 정답이 될 숫자를 랜덤으로 뽑아둔다
		// 사용자에게 값을 입력 받아서 정답과 맞는지 검사
		// - 맞으면 정답 후 입력 횟수를 출력
		// - 정답보다 작으면 UP을 출력을 출력 후 다시 입력받는다
		// - 정답보다 크면 Down을 출력 후 다시 입력받는다
		
		Random ran = new Random();
		
		int n = ran.nextInt(100) + 1;
//		System.out.print(n + " ");
		
		int count =0;
		
		Scanner sc = new Scanner(System.in);
		
		long start = System.currentTimeMillis();
		
		while(true) {
		count ++;
		System.out.print("\n숫자를 입력해주세요: ");
		int input = sc.nextInt();
		
		if (n > input) {
			System.out.println("UP");   
			continue;
		}
		else if (n < input) {
			System.out.println("DOWN"); 
			continue;
		}
		else  {
			System.out.println("정답!"); break;
		}
		}
		
		long end = System.currentTimeMillis();
		System.out.printf("소요 시간 : %.1f초\n" , (end - start) / 1000.0);
		System.out.printf("횟수 : %d회",count);
		
		sc.close();
	}
}
