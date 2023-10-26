package method;


public class Quiz02 {
	static int total(int n) {
		int sum =0;
		for (int i=1; i<=n; i++) {
			sum += i;
		}
		return sum;
	}
	
	static double circle(double radius) {
		double area = 3.14 * radius * radius;
		return area;
	}
	
	static int absolute(int n) {
		if (n < 0) n = -n;
		return n;
	}
	
	static int maxArr(int[] arr) {
		int max = 0;
		for(int i=0; i<arr.length; i++) {
		if (max < arr[i]) max = arr[i];
		}
		
		return max;
	}
	
	static boolean isPrime(int n) {
		int count =0;
		
		for(int i = 1; i<=n; i++) {
			if(n % i ==0) count++;
		}
		
		if (count ==2) return true;
		
		return false;
	}
	public static void main(String[] args) {
		int sum = total(5);
		
		System.out.println("sum = " + sum);
		System.out.println("total(10)= " + total(10));
		
		double cir = circle(6.8);
		
		System.out.println("\ncir = " + cir);
		System.out.println("circle(8.88) = " + circle(8.88));
		
		int abs = absolute(-5);
		
		System.out.println("\nabs = " + abs);
		System.out.println("absolute(5) = " + absolute(5));
		
		System.out.println();
		int[] arr = new int[] {70,50,80,90,60};
		int max = maxArr(arr);
		
		System.out.println("max = " + max);
		
		System.out.println("\n7은 소수 ? " + isPrime(7));
		System.out.println("6은 소수 ? " + isPrime(6));
		
		int count = 0;
		for (int i =1; i<=1000; i++) {
			if (isPrime(i)) {
				System.out.printf("%3d ", i);
				count++;
				
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		
		}
	}
}
