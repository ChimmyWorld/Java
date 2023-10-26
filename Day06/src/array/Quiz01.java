package array;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		int sum=0;
		int max = 0; int min = 99999;
		int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 점수 입력: ");
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("정렬 전 :\n");
		for (int i=0; i<arr.length; i++) {
		System.out.printf("학생[%d]번 = %d점\n", i+1, arr[i]);
		}

		//System.out.println("\n점수 목록: " + Arrays.toString(arr));
		
		for (int i=0; i<arr.length; i++) sum += arr[i];
		double avg = sum / (double)arr.length;
		
		System.out.println("\n학생 점수 합계: " + sum + "\n평균: " + avg);
		
		for (int i = 0; i <arr.length; i++) {
			if (arr[i] > max) max = arr[i];
			if (arr[i] < min) min = arr[i];
		}
		
		System.out.println("가장 높은 점수: " + max + "\n가장 낮은 점수: " + min);
		System.out.println("////////////////////////////////////////////");
		
		int tmp = 0;
		for (int i =0; i<arr.length; i++) {
			for (int j =i+1; j<arr.length; j++) {
				if (arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}	
		
		System.out.println("정렬 후 :\n");
		for (int i=0; i<arr.length; i++) {
				System.out.printf("학생[%d]번 = %d점\n", i+1, arr[i]);
				}
		
	}
}
