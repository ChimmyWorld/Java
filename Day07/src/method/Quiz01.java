package method;

public class Quiz01 {
	static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
		
	static void printArr(double[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	
	static void printArr(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	
	public static void main(String[] args) {
		int[] arr1 = new int[] {10,20,30,40,50};
		double[] arr2 = new double[] {3.14, 5.1};
		String[] arr3 = new String[] {"Java", "C/C++"};

		//3타입 모두 일렬로 출력되게 오버로드
		printArr(arr1);
		System.out.println();
		printArr(arr2);
		System.out.println();
		printArr(arr3);
	}
}
