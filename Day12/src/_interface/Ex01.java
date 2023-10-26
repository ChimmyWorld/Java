package _interface;

import java.util.Arrays;
import java.util.Comparator;

public class Ex01 {
	public static void main(String[] args) {	
		//아래 배열을 정렬하여 출력 (interface의 comparator를 사용)
		Double[] arr = new Double[] {6.123, 3.141592, 5.34};
		
//		Comparator<Double> desc = (Double o1, Double o2)->{
//			return (int) (o2 -o1);
//		};
	
		Comparator<Double> desc = (Double o1, Double o2) ->{
			return o2.compareTo(o1);
		};
		
		Arrays.sort(arr, desc);
		System.out.println("Desc arr = " + Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("Asc arr = " + Arrays.toString(arr));
	    
		Arrays.sort(arr, (Double o1, Double o2) -> o2.compareTo(o1));
		System.out.println("arr = " + Arrays.deepToString(arr));
		
	}
}
