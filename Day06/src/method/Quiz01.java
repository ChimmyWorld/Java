package method;

public class Quiz01 {
	static void printNumber(int n) {
		for (int i =1; i <=n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	static void printDivisor(int n) {
		for (int i = 1; i <=n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	static void printNum(int n1, int n2) {

		for (int i = n1; i<=n2; i++){
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	static void printArr(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("[1 ~ n 까지 출력]");
		printNumber(5);
		printNumber(3);
		
		System.out.println("\n[약수 출력]");
		printDivisor(5);
		printDivisor(9);
		
		System.out.println("\n[n ~ m 사이의 수 출력]");
		printNum(5, 10);
		printNum(7, 10);
		
		System.out.println("\n전달한 배열을 일렬로 출력");
		int[] arr1 = new int[] {10,20,30};
		int[] arr2 = new int[] {3,5,7,9};
		
		printArr(arr1);
		printArr(arr2);
	}
}
