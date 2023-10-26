package method;

public class Ex04 {
	static void func1(int n) {
		n++;
	}
	
	static void func2(int[] arr) {
		arr[0]++;
	}
	
	public static void main(String[] args) {
		int n = 10;
		int[] arr= new int[] {10};
		
		func1(n); 
		System.out.println("n = " + n);
		
		func2(arr);
		System.out.println("arr[0] = " + arr[0]);
	}
}
