package controlSet;

import java.util.Random;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		int floor;
		int A = 4, B = 9, C = 12;
		
		System.out.print("층수를 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
				
		floor = sc.nextInt();
		
		int Amin = rand.nextInt(15) + 1;
		int Bmin = rand.nextInt(15) + 1;
		int Cmin = rand.nextInt(15) + 1;
		
		if(Amin < 0) Amin = -Amin;
		if(Bmin < 0) Bmin = -Bmin;
		if(Cmin < 0) Cmin = -Cmin;
		
		System.out.println("A층:" + Amin + " B층:" + Bmin + " C층:" + Cmin);
		
		char name = 'A';
		int min = Amin;
		
		if (min > Bmin) {
			min = Bmin;
			name = 'B';
		}
		if (min > Cmin) {
			min = Cmin;
			name = 'C';
		}
		
		System.out.println("가장 가까운 층수는 " + name + "입니다.");
		sc.close();	
	}
		
}
