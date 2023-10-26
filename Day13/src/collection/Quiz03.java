package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Lotto{
	private static Random rand = new Random();

	static List<Integer> getLotto(){
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size() != 6) {
			int n = rand.nextInt(45) +1;
			set.add(n);
		}
		
		ArrayList<Integer> lotto = new ArrayList<Integer>(set);
		
		lotto.sort(null);
		
		return lotto;
	}
}

public class Quiz03 {
	public static void main(String[] args) throws InterruptedException {
		// 로또 추첨기를 구현
		// 1. 1 ~ 45 사이의 숫자를 무작위로 뽑는다
		// 2. 단, 중복 없이 6개를 뽑아야 한다
		// 3. 결과 발표는 낮은 숫자부터 발표
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("로또 구매 개수: ");
		n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			System.out.println("로또 번호: " + Lotto.getLotto());
			Thread.sleep(500);
		}
		
		sc.close();
		
	}
}
