package method;

public class Ex01 {
	static int adder(int n1, int n2) {
		return n1 + n2;
	}
	
	static int adder (int n) {
		return n + 100;
	}
	
	static double adder(double n) { 
		return n + 3.14;
	}
	
	public static void main(String[] args) {
		System.out.println("adder(5,3)=  " + adder(5,3));
		System.out.println("adder(5) = " + adder(5));
		System.out.println("adder(5.0) = " + adder(5.0));
	}
}
