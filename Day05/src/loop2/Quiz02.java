package loop2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("줄 수 입력: ");
		int n = sc.nextInt();
		
		
		System.out.println("1. ㅁ 찍기");	
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (i == 0 || i == (n-1) || j == 0 || j == (n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
		System.out.println("\n");
		}
		
		System.out.println("2. + 찍기");
		for (int i= 0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (i==(n/2)|| j ==(n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		System.out.println("3. X 찍기");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == (n - 1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("4. Z 찍기");
		for (int i=0; i<n; i++) {
			for (int j =0; j<n; j++) {
				if (i ==0 || i ==(n-1) || i+j ==(n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
