package generic;

class Person {
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "(" + age + "세)";
	}
	
	String getName() {
		return name;
	}
	
}

public class Ex01 {

	static <T> void printArr(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		int[] arr1 = new int[] { 10,20,30,40,50};
		Integer[] arr2 = new Integer[] { 10,20,30,40,50};
		Double[] arr3 = new Double[] {3.14, 5.9, 6.123};
		String[] arr4 = new String[] { "Java", "Python"};
		Person[] arr5 = new Person[] {
				new Person("홍길동", 33), 
				new Person("김민지", 25)
		};
		
		//printArr(arr1);   기본 자료형은 제네릭으로 받을 수 없다
		printArr(arr2);
		printArr(arr3);
		printArr(arr4);
		printArr(arr5);
		
	}
}
