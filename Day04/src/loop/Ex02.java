package loop;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int n = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 입력: ");
		int dan = sc.nextInt();
		
		while (n <= 9) {
			System.out.println(dan + " * " +  n + " = " + (dan * n));
			n++;
		}
		
		System.out.println("");
		
		n = 10;
		while (n >= 0) {
			System.out.println("2 * " + n + " = " + (2 * n));
			n--;
		}
		
		System.out.println("");
		
		int i = 1;
		while (i < 10) {
			while (n < 10) {
				System.out.println(i + " * " + n + " = " + (i *n) );
				n++;
			}
			i++;
			System.out.println("");
			n= 1;
		}
		
		
	}
}

