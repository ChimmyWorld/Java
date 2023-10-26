package array;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {10,20,30,40,50};
		
		int[][] arr2 = new int[][] {
			{10,20,30,40},
			{11,21,31,41},
			{12,22,32,42}
		};
		
		System.out.println("arr2 = " + arr2);
		System.out.println("arr2[0] = " + Arrays.toString(arr2[0]));
		System.out.println("arr2[0][1] = " + arr2[0][1] + "\n");
		
		System.out.println("41 = " + arr2[1][3]);
		System.out.println("22 = " + arr2[2][1]);
	}
	

}
