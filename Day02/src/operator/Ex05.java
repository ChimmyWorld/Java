package operator;

public class Ex05 {
	public static void main (String[] args) {
		int n = 10;
		
		++n; 
		System.out.println("n = " + n );
		
		--n;
		System.out.println("n = " + n );
		
		n++;
		System.out.println("n = " + n );
		
		n--;
		System.out.println("n = " + n);
		
		int n1 = 10, n2, n3;
		
		n2 = ++n1;
		System.out.printf("n1 = %d, n2 = %d\n",  n1, n2);
		
		n1 = 10;
		
		n3 = n1++;
		
		System.out.printf("n1 = %d, n3 = %d\n", n1, n3);
		
		int a = 3, b = 4, c = 2, d;
		
		d = ++a + b-- + c--;
//		d = 3   +  4  + 2;
//		a(4) -> d(10) -> b(3) -> c(1)   
		System.out.println("a = " + a); 
		System.out.println("b = " + b);  
		System.out.println("c = " + c); 
		System.out.println("d = " + d); 
		
	}
}
