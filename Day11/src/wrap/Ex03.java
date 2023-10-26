package wrap;

public class Ex03 {
	
	static <T> void printArr(T[] arr) {
		for (int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Integer[] arr1 = new Integer[] {10, 20, 30, 40};
		Double[] arr2 = new Double[] {10.5, 3.14};
		// int, double은 일반자료형으로 Object를 상속받지 못해 사용 불가능
		// 따라서, Wrapper Class로 변경하게 되면 아래 출력시 모두 사용 가능하게 된다
		String[] arr3 = new String[] {"Java", "Network", "SQL"};
		
		printArr(arr1);
		printArr(arr2);
		printArr(arr3);
		
		
	}
}
