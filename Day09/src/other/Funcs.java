package other;

public class Funcs {
	public static int abs(int n) {
		if(n < 0) {
			return -n;
		}
		return n;
	}
	
	public static String toString(int[] arr) {
		int i =0;
		String result = "[";
		
		for (i =0; i< arr.length -1 ; i++) {
			result += arr[i] + ",";
		}
		
		return result += arr[i] + "]";
	}
	
	
	public static int arrTotal(int[] arr) {
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static int arrMax(int[] arr) {
		int max = 0;
		for (int i= 0; i<arr.length; i++) {
			if (max < arr[i]) max = arr[i];
		}
		return max;
	}
	
	public static boolean isPrime(int n) {
		int count =0;
		
		for (int i =1; i <= n; i++) {
			if (n % i == 0) count++;
		}
		if (count == 2) return true;
		return false;
	}
	
}
